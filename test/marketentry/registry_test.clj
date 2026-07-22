(ns marketentry.registry-test
  (:require [clojure.test :refer [deftest is testing]]
            [marketentry.registry :as registry]))

(deftest engagement-fee-recompute
  (let [e {:base-fee 500000 :monthly-rate 30000 :monitoring-months 12 :claimed-fee 860000.0}]
    (is (== 860000.0 (registry/compute-engagement-fee e)))
    (is (true? (registry/engagement-fee-matches-claim? e))))
  (let [bad {:base-fee 500000 :monthly-rate 30000 :monitoring-months 12 :claimed-fee 999000.0}]
    (is (false? (registry/engagement-fee-matches-claim? bad)))))

(deftest register-draft-and-submit
  (let [d (registry/register-draft "eng-1" "PNG" 0)
        s (registry/register-submit "eng-1" "PNG" 0)]
    (is (= "PNG-DFT-000000" (get d "draft_number")))
    (is (= "PNG-SUB-000000" (get s "submit_number")))
    (is (nil? (get-in d ["certificate" "proof"])))
    (is (= "draft-unsigned" (get-in s ["certificate" "status"])))))

(deftest register-requires-ids
  (is (thrown? Exception (registry/register-draft "" "PNG" 0)))
  (is (thrown? Exception (registry/register-submit "eng-1" "" 0))))

(deftest foreign-enterprise-at-or-above-threshold
  (testing "the Investment Promotion Act 1992 s.28 threshold is 50 percent ownership/control/management by non-citizens -- at or above is a foreign enterprise"
    (is (true? (registry/foreign-enterprise? {:foreign-ownership-pct 0.50})))
    (is (true? (registry/foreign-enterprise? {:foreign-ownership-pct 0.75})))
    (is (true? (registry/foreign-enterprise? {:foreign-ownership-pct 1.0})))))

(deftest not-foreign-enterprise-below-threshold
  (testing "below 50 percent is not a foreign enterprise under the Act's own definition"
    (is (false? (registry/foreign-enterprise? {:foreign-ownership-pct 0.49})))
    (is (false? (registry/foreign-enterprise? {:foreign-ownership-pct 0.0})))
    (is (false? (registry/foreign-enterprise? {:foreign-ownership-pct nil}))))
  (testing "no declared percentage at all -> not a foreign enterprise (fails, does not throw)"
    (is (false? (registry/foreign-enterprise? {})))))

(deftest fec-exemption-claim-invalid-is-entity-scope-gated
  (testing "an engagement NOT claiming FEC exemption is never flagged, even if its ownership would fail exemption"
    (is (false? (registry/fec-exemption-claim-invalid? {:claims-fec-exempt? false
                                                          :foreign-ownership-pct 0.99}))))
  (testing "an engagement claiming FEC exemption whose declared foreign-ownership meets/exceeds 50 percent -> invalid exemption claim"
    (is (true? (registry/fec-exemption-claim-invalid? {:claims-fec-exempt? true
                                                         :foreign-ownership-pct 0.75}))))
  (testing "an engagement claiming FEC exemption whose declared foreign-ownership is genuinely below 50 percent -> not flagged"
    (is (false? (registry/fec-exemption-claim-invalid? {:claims-fec-exempt? true
                                                          :foreign-ownership-pct 0.0})))
    (is (false? (registry/fec-exemption-claim-invalid? {:claims-fec-exempt? true
                                                          :foreign-ownership-pct 0.49})))))
