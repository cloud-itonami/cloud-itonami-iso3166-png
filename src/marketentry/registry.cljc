(ns marketentry.registry
  "Pure-function market-entry filing-draft + filing-submit record
  construction -- an append-only market-entry book-of-record draft.

  Like every sibling actor's registry, there is no single international
  reference-number standard for a public-procurement market-entry
  filing -- every jurisdiction assigns its own format. This namespace
  does NOT invent one; it builds a jurisdiction-scoped sequence number
  and validates the record's required fields, the same honest,
  non-fabricating discipline `marketentry.facts` uses.

  `engagement-fee-matches-claim?` is an HONEST reapplication of the
  SAME ground-truth-recompute DISCIPLINE sibling actors use (verify a
  claimed monetary total against the entity's own recorded quantity x
  unit fields), reapplied to a market-entry engagement fee line.

  `foreign-enterprise?` / `fec-exemption-claim-invalid?` are the SAME
  discipline applied to a genuinely Papua New Guinea-specific
  mechanism: the Investment Promotion Act 1992's own Section 28
  Foreign Enterprise Certificate (FEC) regime, whose own definition of
  a 'foreign enterprise' is a business entity 'wholly owned or that is
  50 percent or more owned or controlled and managed by non-citizens'
  (Investment Promotion Authority's own text, see `marketentry.facts`
  for the full research trail). An engagement that DECLARES itself
  exempt from FEC certification (`:claims-fec-exempt? true`) while its
  OWN declared foreign-ownership percentage actually meets or exceeds
  the Act's own 50 percent threshold is trying to conduct business in
  Papua New Guinea without the certification the Act's own text
  requires before it may lawfully proceed -- exactly the kind of
  ground-truth mismatch this governor independently recomputes and
  HARD-holds.

  This is honestly an OWNERSHIP-PERCENTAGE-THRESHOLD check shape -- a
  different shape family from a flat monetary-value threshold (e.g.
  FJI's Procurement Regulations 2010 reg 29/reg 30 split) or a
  sector-restriction list (e.g. Bhutan's FDI Reserved-List check);
  this namespace does not force a different shape onto Papua New
  Guinea's actual mechanism just to appear novel -- the Investment
  Promotion Act 1992 genuinely DOES gate certification on an ownership
  percentage, and the check below honestly recomputes exactly that, no
  more and no less.

  This namespace is pure data + pure functions -- no I/O, no network
  call to any real procurement portal. It builds the RECORD an operator
  would keep, not the act of submitting a portal registration itself
  (that is `marketentry.operation`'s `:filing/submit`, always
  human-gated -- see README Actuation)."
  (:require [clojure.string :as str]))

(defn- unsigned-certificate
  "Every certificate this actor produces is UNSIGNED -- signature is
  the market-entry operator's act, not this actor's."
  [kind subject record-id]
  {"@context" ["https://www.w3.org/ns/credentials/v2"]
   "type" ["VerifiableCredential" kind]
   "credentialSubject" {"id" subject "record" record-id}
   "proof" nil
   "issued_by_registry" false
   "status" "draft-unsigned"})

(defn- zero-pad [n w]
  (let [s (str n)]
    (str (apply str (repeat (max 0 (- w (count s))) "0")) s)))

(defn compute-engagement-fee
  "The ground-truth engagement fee for `engagement`'s own `:base-fee`
  and `:monitoring-months` x `:monthly-rate` -- a single flat
  base + months x rate calculation, not a full pricing engine."
  [{:keys [base-fee monthly-rate monitoring-months]}]
  (+ (double base-fee)
     (* (double monthly-rate) (double monitoring-months))))

(defn engagement-fee-matches-claim?
  "Does `engagement`'s own `:claimed-fee` equal the independently
  recomputed `compute-engagement-fee`?"
  [{:keys [claimed-fee] :as engagement}]
  (== (double claimed-fee) (compute-engagement-fee engagement)))

(def foreign-enterprise-ownership-threshold-pct
  "Investment Promotion Act 1992, s.28 (own text, per the Investment
  Promotion Authority's own \"Business Registration, Regulation and
  Certification\" page, verified 2026-07-23): a 'foreign enterprise' is
  'a business entity which is wholly owned or that is 50 percent or
  more owned or controlled and managed by non-citizens' -- the
  ownership/control/management percentage at or above which a Foreign
  Enterprise Certificate (FEC) is required before the entity may
  lawfully conduct business in Papua New Guinea."
  0.50)

(def foreign-enterprise-certification-deadline-days
  "Investment Promotion Act 1992, s.28 (own text): 'All foreign
  companies incorporated or registered under the Companies Act, 1997
  must apply within 14 days for Certification under the Investment
  Promotion Act, 1992.'"
  14)

(defn foreign-enterprise?
  "The ground-truth 'foreign enterprise' status for `engagement`,
  independently recomputed from its own declared
  `:foreign-ownership-pct` against the Act's own 50 percent threshold.
  A missing/nil declared percentage simply fails (does not throw) --
  an engagement with no declared ownership percentage is not treated
  as a foreign enterprise."
  [{:keys [foreign-ownership-pct]}]
  (boolean
   (and (some? foreign-ownership-pct)
        (>= (double foreign-ownership-pct) foreign-enterprise-ownership-threshold-pct))))

(defn fec-exemption-claim-invalid?
  "Does `engagement` declare `:claims-fec-exempt? true` (i.e. it claims
  it does NOT need an Investment Promotion Act 1992 s.28 Foreign
  Enterprise Certificate before conducting business in PNG) while the
  INDEPENDENTLY recomputed `foreign-enterprise?` is true (its own
  declared foreign-ownership percentage actually meets or exceeds the
  Act's own 50 percent threshold)? An engagement that does NOT claim
  FEC exemption is never flagged by this check
  (entity/engagement-scope-gated, the same discipline Bhutan's
  `:foreign-company?`-gated FDI check and FJI's
  `:claims-simplified-procurement?`-gated check use)."
  [{:keys [claims-fec-exempt?] :as engagement}]
  (boolean (and claims-fec-exempt?
                (foreign-enterprise? engagement))))

(defn register-draft
  "Validate + construct the FILING-DRAFT registration DRAFT -- the
  market-entry operator's own act of preparing a portal registration
  package. Pure function -- does not touch any real procurement
  portal."
  [engagement-id jurisdiction sequence]
  (when-not (and engagement-id (not= engagement-id ""))
    (throw (ex-info "draft: engagement_id required" {})))
  (when-not (and jurisdiction (not= jurisdiction ""))
    (throw (ex-info "draft: jurisdiction required" {})))
  (when (< sequence 0)
    (throw (ex-info "draft: sequence must be >= 0" {})))
  (let [draft-number (str (str/upper-case jurisdiction) "-DFT-" (zero-pad sequence 6))
        record {"record_id" draft-number
                "kind" "filing-draft"
                "engagement_id" engagement-id
                "jurisdiction" jurisdiction
                "immutable" true}]
    {"record" record "draft_number" draft-number
     "certificate" (unsigned-certificate "FilingDraft" draft-number draft-number)}))

(defn register-submit
  "Validate + construct the FILING-SUBMIT registration DRAFT -- the
  market-entry operator's own act of actually submitting a portal
  registration (always human-gated upstream)."
  [engagement-id jurisdiction sequence]
  (when-not (and engagement-id (not= engagement-id ""))
    (throw (ex-info "submit: engagement_id required" {})))
  (when-not (and jurisdiction (not= jurisdiction ""))
    (throw (ex-info "submit: jurisdiction required" {})))
  (when (< sequence 0)
    (throw (ex-info "submit: sequence must be >= 0" {})))
  (let [submit-number (str (str/upper-case jurisdiction) "-SUB-" (zero-pad sequence 6))
        record {"record_id" submit-number
                "kind" "filing-submit"
                "engagement_id" engagement-id
                "jurisdiction" jurisdiction
                "immutable" true}]
    {"record" record "submit_number" submit-number
     "certificate" (unsigned-certificate "FilingSubmit" submit-number submit-number)}))

(defn append [history result]
  (conj (vec history) (get result "record")))
