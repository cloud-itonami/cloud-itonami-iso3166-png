(ns marketentry.facts
  "Per-jurisdiction public-procurement market-entry regulatory catalog
  -- the G2-style spec-basis table the Market-Entry Compliance Governor
  checks every `:jurisdiction/assess` proposal against ('did the advisor
  cite an OFFICIAL public source for this jurisdiction's requirements,
  or did it invent one?').

  Independent State of Papua New Guinea's real market-entry surface
  (curl/WebFetch-verified 2026-07-22/23; where a live official page
  could not be reached this session, that is stated explicitly and the
  corresponding fact is sourced from a `web.archive.org` snapshot of
  the SAME official page/document instead -- never invented):

  - **Public procurement** is administered by the **National
    Procurement Commission (NPC)**, a Statutory Body. This iteration
    fetched `npc.gov.pg` directly (live, HTTP 200) and downloaded its
    own hosted, certified PDF of the *National Procurement (Amendment)
    Act 2021* (`npc.gov.pg/wp-content/uploads/2024/05/National-
    Procurement-Amendment-Act-2021.pdf`, No. 13 of 2021, certified 25
    Oct 2021) -- the amendment's OWN preamble, read directly, states:
    \"Being an Act to amend the *National Procurement Act 2018* to
    further make provision for the management of national procurement
    ...\". This is the primary confirmation of the principal Act's
    exact name and year used in this catalog. Separately, NPC's own
    Minister's Foreword page (`npc.gov.pg/about-us/ministers-foreword/`,
    fetched directly) states NPC was \"established ... as a Statutory
    Body under the *National Procurement Commission Act, 2018* and the
    *Regulatory Statutory Authority Act, 2013*\" -- note the SAME
    official site names the principal Act slightly differently on this
    one page (\"National Procurement Commission Act\" vs. the certified
    Act PDF's own \"National Procurement Act\"); this catalog treats the
    certified Act PDF's own preamble as authoritative for the exact
    title and cites both quotes honestly rather than silently picking
    one. This iteration did NOT independently confirm the widely
    repeated claim that NPC replaced a prior \"Central Supply and
    Tenders Board\" -- no official source fetched this session states
    this, so it is NOT asserted here.
  - **The Act's own text (read directly from the certified 2021
    amendment PDF) sets a multi-tier procurement-value-threshold
    ladder in its own Section 26(1) (as substituted)**: (a) minor
    procurements of not more than K50,000.00 may be self-procured by
    the public/statutory body itself using a simplified system approved
    by the Commission; (b) K50,001.00 to K1,000,000.00 may be
    self-procured using a standardised system approved by the
    Commission; (c) above K1,000,000.00, the public/statutory body
    \"shall not procure themselves\" -- procurement is instead
    undertaken on their behalf BY THE COMMISSION; (d) a Provincial
    Committee of the Board may self-procure up to K10,000,000.00; (e) a
    District Committee of the Board, up to K5,000,000.00; (f) a Special
    Committee of the Board, up to K5,000,000.00. Section 12(1)(b)/(c)/
    (d) (as substituted) separately sets the Board's OWN threshold at
    K10,000,000.00 for approving/awarding contracts undertaken by the
    Commission itself, with contracts above that value going to the
    National Executive Council. This ladder is documented here as real,
    citable `:national-spec` content; it is NOT built into this
    vertical's flagship governor check (see below for why).
  - **The flagship check this vertical adds is grounded in a
    DIFFERENT, genuinely well-grounded mechanism this iteration found**
    (per the task's own suggestion to investigate it): the
    **Investment Promotion Authority (IPA)'s dual role** as both (1)
    Papua New Guinea's company/business registrar (\"through the
    Companies Office\", per IPA's own site, `www.ipa.gov.pg`, fetched
    directly, live, HTTP 200: \"The Investment Promotion Authority
    (IPA) through the Companies Office is responsible for the
    administration of Papua New Guinea's key business laws such as the
    Companies Act, Business Names Act, Business Groups Incorporation
    Act and the Associations Incorporation Act\") AND (2) PNG's
    foreign-investment screening/certification authority under a
    SPECIFIC, citable section number: IPA's own \"Business
    Registration, Regulation and Certification\" page
    (`www.ipa.gov.pg/public/help.aspx?cn=BusinessRegulations`, fetched
    directly this session) states, in its own words: \"The Business
    Registration and Certification Division is also responsible for
    facilitating investments in Papua New Guinea, in line with
    **Section 28 of the Investment Promotion Act, 1992**. The provision
    requires all foreign enterprises intending to operate in Papua New
    Guinea to be certified by the Authority before they proceed to
    conduct business in the country ... **A foreign enterprise is a
    business entity which is wholly owned or that is 50 percent or more
    owned or controlled and managed by non-citizens.** A foreign
    enterprise must firstly register under the Companies Act 1997 ...
    All foreign companies incorporated or registered under the
    Companies Act, 1997 must apply within 14 days for Certification
    under the Investment Promotion Act, 1992.\" This gives a SPECIFIC,
    citable numeric threshold (50 percent ownership/control/management
    by non-citizens) AND a specific deadline (14 days) -- not a vague
    'screening applies' claim. This iteration independently
    cross-confirmed IPA's registration role from a THIRD, unrelated
    official source: the Internal Revenue Commission's own archived
    Taxpayer Guide (see below) instructs TIN applicants to write
    \"the official name of your entity, as registered with the
    Investment Promotion Authority (IPA)\" and to obtain a \"Company
    Extract Number ... provided by the Investment Promotion Authority
    (IPA)\" -- an independent corroboration, not copied from IPA's own
    page to itself.
  - **A Reserved Activities List (RAL) also exists** under the
    Investment Promotion Regulations (Investment Promotion Act 1992),
    confirmed directly from IPA's own \"Reserved Activities List
    Review\" page (`www.ipa.gov.pg/public/help.aspx?cn=RALReview`,
    fetched directly): \"Reserved activities are identified economic
    activities that foreign enterprises cannot be granted permission to
    engage in. If an activity is reserved, the Registrar of Foreign
    Investment must refuse an application for a Foreign Enterprise
    Certificate (FEC).\" The same page states a January 2023 reform
    requires RAL review at least every 3 years, per the IPA Board's own
    obligation under \"section 27C(5) of the Investment Promotion Act
    1992\", and (as of the review this iteration read) the PROPOSED
    modernised list \"reserves 11 activities across forestry,
    fisheries, mining, retail, and PNG cultural expression products\"
    (e.g. alluvial gold mining on customary land without a lease under
    the Mining Act 1992; trading in PNG cultural expression products
    such as bilums, carvings, textiles, pottery and jewellery; retail
    at markets and stalls) -- explicitly DISTINCT from occupations
    reserved for citizens under the Employment of Non-Citizens Act
    2007 (a work-permit regime, not a FEC regime), per the same page's
    own text. This iteration did NOT independently fetch the RAL's own
    full current gazetted text (only IPA's own review-page summary of
    it), and does NOT build a sector-restricted-activity governor check
    from it -- the flagship check below uses the ownership-percentage
    mechanism instead, a genuinely different shape from a sector list.
  - **Tax/TIN registration**: the **Internal Revenue Commission
    (IRC)**. This iteration could NOT reach the LIVE current
    `irc.gov.pg` with useful content this session -- it fetched HTTP
    200 directly, but the site is now a client-side-rendered
    JavaScript SPA (\"myirc\"; own text: \"We're sorry but myirc doesn't
    work properly without JavaScript enabled\") this iteration could
    not query for substantive content. Instead, this iteration located
    and read IRC's own official \"Taxpayer Guide\" PDF, *Applying for a
    Taxpayer Identification Number* (form code 2014-TPG-T1-02), via a
    `web.archive.org` snapshot of `irc.gov.pg`'s pre-SPA WordPress site
    (archived 2016; the live original is no longer served in this
    form) -- its own text, read directly: \"The Internal Revenue
    Commission requires individuals and businesses to register if they
    meet certain requirements.\" The guide names two forms: **TIN1**
    (non-individual entity registration -- companies, groups,
    associations) and **TIN2** (individual registration), and its own
    'Enterprise Identification Details' field instructions independently
    corroborate IPA's registration role (quoted above). CURRENCY
    CAVEAT: this specific document is dated 2014 and this iteration
    could NOT independently confirm whether the TIN1/TIN2 form numbers
    or process have since changed on the current `myirc` platform --
    an honest gap, not a claim of current accuracy beyond what was
    read.
  - This iteration also specifically looked for a representative/
    local-agent exclusion-extension provision in PNG's procurement or
    investment regime (the shape several sibling catalogs document for
    their own laws) and did NOT find one in any source fetched this
    session -- `rep-spec-basis` is honestly nil for PNG: an absence of
    confirmation, not a confirmed absence (this iteration did not read
    the National Procurement Act 2018's own full primary text beyond
    the sections quoted in the 2021 amendment, so this is a narrower
    claim than FSM's own confirmed-absent finding for its Public
    Contracts Act).

  Coverage is reported HONESTLY (see `coverage`): a jurisdiction not in
  this table has NO spec-basis, full stop -- the advisor must not
  fabricate one, and the governor holds if it tries.")

(def catalog
  "iso3 -> requirement map. `:required-evidence` mirrors the generic
  intake/portal-registration/filing evidence set; `:legal-basis` /
  `:owner-authority` / `:provenance` are the G2 citation the governor
  requires before any `:jurisdiction/assess` proposal can commit. PNG
  deliberately carries NO `:rep-owner-authority` -- see the namespace
  docstring's honest-scope-narrowing note (this iteration did not find,
  but also did not exhaustively rule out, such a provision).
  `:foreign-enterprise-owner-authority` /
  `:foreign-enterprise-legal-basis` / `:foreign-enterprise-criteria` /
  `:foreign-enterprise-provenance` ground this vertical's flagship
  governor check (`foreign-enterprise?`/
  `fec-exemption-claim-invalid?` in `marketentry.registry`)."
  {"PNG" {:name "Independent State of Papua New Guinea"
          :owner-authority "National Procurement Commission (NPC), a Statutory Body -- per NPC's own certified National Procurement (Amendment) Act 2021 PDF, established under the National Procurement Act 2018; NPC's own Minister's Foreword page separately names it the \"National Procurement Commission Act, 2018\" together with the \"Regulatory Statutory Authority Act, 2013\" -- both official npc.gov.pg citations are reported honestly rather than silently reconciled"
          :legal-basis "National Procurement Act 2018, as amended by the National Procurement (Amendment) Act 2021 (No. 13 of 2021, certified 25 Oct 2021) -- own Section 26(1) (as substituted) sets the procurement-threshold ladder: K50,000.00 and under (simplified, self-procured); K50,001.00-K1,000,000.00 (standardised, self-procured); above K1,000,000.00 (procured on the body's behalf by the Commission); Provincial Committee of the Board up to K10,000,000.00; District/Special Committee of the Board up to K5,000,000.00 each. Section 12(1) (as substituted) sets the Board's own K10,000,000.00 threshold for approving/awarding Commission-run procurements, above which the National Executive Council is engaged. Read directly from the certified Act PDF hosted by NPC itself."
          :national-spec "NPC (npc.gov.pg, own tagline: \"Improving Efficiency and Transparency in Public Procurement\") is the information hub for tender advertisements and Electronic Government Procurement (e-GP) initiatives; as of this session NPC's own site shows an active RFP (NPC/2026-26) to BUILD an e-GP system -- i.e. no live, bespoke, self-service transactional e-procurement portal was confirmed operational this session, only the informational tender-notice hub itself"
          :provenance "https://npc.gov.pg/ ; https://npc.gov.pg/wp-content/uploads/2024/05/National-Procurement-Amendment-Act-2021.pdf ; https://npc.gov.pg/about-us/ministers-foreword/"
          :required-evidence ["Investment Promotion Authority (IPA) business/company registration record (Companies Act 1997 / Business Names Act / Business Groups Incorporation Act / Associations Incorporation Act, administered by IPA's Companies Office)"
                              "Internal Revenue Commission (IRC) Taxpayer Identification Number (TIN) registration record (TIN1 for non-individual entities, TIN2 for individuals)"
                              "National Procurement Commission procurement-threshold/track declaration confirmation record, per the Act's own Section 26(1) ladder"
                              "IPA Foreign Enterprise Certificate (FEC) record, when the engagement declares itself a foreign enterprise (Investment Promotion Act 1992, s.28)"
                              "Authorized-representative confirmation record"]
          :corporate-number-owner-authority "Internal Revenue Commission (IRC)"
          :corporate-number-legal-basis "IRC's own Taxpayer Guide, \"Applying for a Taxpayer Identification Number\" (form 2014-TPG-T1-02, read via a web.archive.org snapshot of the pre-SPA irc.gov.pg site -- the live current site is a JavaScript SPA this iteration could not query directly): \"The Internal Revenue Commission requires individuals and businesses to register if they meet certain requirements.\" Two forms: TIN1 (non-individual entities) and TIN2 (individuals). This iteration did not independently confirm whether the form numbers/process have changed since this 2014-dated document."
          :corporate-number-provenance "https://web.archive.org/web/20160804131457/http://www.irc.gov.pg:80/PDF_files/2014-TPG-T1-02%20-%20TIN%20Form%20-%20Taxpayer%20Guide.pdf"
          :foreign-enterprise-owner-authority "Investment Promotion Authority (IPA) Business Registration and Certification Division / Registrar of Foreign Investment, per IPA's own \"Business Registration, Regulation and Certification\" and \"Reserved Activities List Review\" pages"
          :foreign-enterprise-legal-basis "Investment Promotion Act 1992, s.28 (own text, quoted directly from ipa.gov.pg): \"The provision requires all foreign enterprises intending to operate in Papua New Guinea to be certified by the Authority before they proceed to conduct business in the country ... A foreign enterprise is a business entity which is wholly owned or that is 50 percent or more owned or controlled and managed by non-citizens ... All foreign companies incorporated or registered under the Companies Act, 1997 must apply within 14 days for Certification under the Investment Promotion Act, 1992.\" A Reserved Activities List (RAL) also exists under the Investment Promotion Regulations (own s.27C(5) review obligation) but is NOT the basis of this catalog's flagship check (see namespace docstring)"
          :foreign-enterprise-criteria {:foreign-enterprise-ownership-threshold-pct 0.50
                                        :certification-deadline-days 14}
          :foreign-enterprise-provenance "https://www.ipa.gov.pg/public/help.aspx?cn=BusinessRegulations ; https://www.ipa.gov.pg/public/help.aspx?cn=RALReview"}
   "USA" {:name "United States"
          :owner-authority "U.S. General Services Administration (GSA) / SAM.gov"
          :legal-basis "Federal Acquisition Regulation (FAR); System for Award Management"
          :national-spec "SAM.gov entity registration + NAICS self-certification"
          :provenance "https://sam.gov/"
          :required-evidence ["EIN record"
                              "SAM.gov registration record"
                              "State business registration record"
                              "Authorized-representative record"]}
   "DEU" {:name "Germany"
          :owner-authority "Beschaffungsamt des BMI / e-Vergabe platforms"
          :legal-basis "Gesetz gegen Wettbewerbsbeschränkungen (GWB) / VgV"
          :national-spec "e-Vergabe supplier registration under EU procurement directives"
          :provenance "https://www.evergabe-online.de/"
          :required-evidence ["Handelsregister extract"
                              "e-Vergabe registration record"
                              "USt-IdNr record"
                              "Authorized-representative record"]}})

(defn spec-basis
  "The jurisdiction's requirement map, or nil -- nil means NO spec-basis,
  and the governor must hold any proposal that tries to assess or file
  on it."
  [iso3]
  (get catalog iso3))

(defn coverage
  "Honest coverage report: how many of the requested jurisdictions actually
  have a spec-basis entry. Never report a missing jurisdiction as covered."
  ([] (coverage (keys catalog)))
  ([iso3s]
   (let [have (filter catalog iso3s)
         missing (remove catalog iso3s)]
     {:requested (count iso3s)
      :covered (count have)
      :covered-jurisdictions (vec (sort have))
      :missing-jurisdictions (vec (sort missing))
      :note (str "cloud-itonami-iso3166-png R0: " (count catalog)
                 " jurisdictions seeded with an official spec-basis. "
                 "This is a starting catalog for market-entry navigation, "
                 "not a survey of all ~194 jurisdictions -- extend "
                 "`marketentry.facts/catalog`, never fabricate a "
                 "jurisdiction's requirements.")})))

(defn required-evidence-satisfied?
  "Does `submitted` (a set/coll of evidence keywords or strings) satisfy
  every evidence item listed for `iso3`? Missing spec-basis -> never
  satisfied."
  [iso3 submitted]
  (when-let [{:keys [required-evidence]} (spec-basis iso3)]
    (let [need (count required-evidence)
          have (count (filter (set submitted) required-evidence))]
      (= need have))))

(defn evidence-checklist [iso3]
  (:required-evidence (spec-basis iso3) []))

(defn rep-spec-basis
  "The jurisdiction's representative-related requirement map, or nil when
  this catalog has no such regime. For PNG this is deliberately nil --
  see the `catalog` docstring's honest-scope-narrowing note (this
  iteration did not find such a provision in any source fetched this
  session, but also did not read the National Procurement Act 2018's
  own full primary text end-to-end, so this is an absence of
  confirmation rather than a confirmed absence)."
  [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:rep-owner-authority sb)
      (select-keys sb [:rep-owner-authority :rep-legal-basis :rep-provenance]))))

(defn corporate-number-spec-basis
  "The jurisdiction's corporate-number / tax-id regime, or nil."
  [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:corporate-number-owner-authority sb)
      (select-keys sb [:corporate-number-owner-authority
                       :corporate-number-legal-basis
                       :corporate-number-provenance]))))

(defn foreign-enterprise-spec-basis
  "The jurisdiction's foreign-enterprise-certification regime, or nil.
  For PNG this is real and current -- the flagship check this vertical
  adds is grounded here (Investment Promotion Act 1992, s.28: a
  wholly-owned or >= 50%-non-citizen-owned/controlled/managed
  enterprise must hold a Foreign Enterprise Certificate before
  conducting business in PNG)."
  [iso3]
  (when-let [sb (spec-basis iso3)]
    (when (:foreign-enterprise-owner-authority sb)
      (select-keys sb [:foreign-enterprise-owner-authority
                       :foreign-enterprise-legal-basis
                       :foreign-enterprise-criteria
                       :foreign-enterprise-provenance]))))
