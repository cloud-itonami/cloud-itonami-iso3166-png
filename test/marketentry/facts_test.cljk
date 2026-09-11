(ns marketentry.facts-test
  (:require [clojure.test :refer [deftest is testing]]
            [marketentry.facts :as facts]))

(deftest png-has-spec-basis
  (let [sb (facts/spec-basis "PNG")]
    (is (some? sb))
    (is (string? (:provenance sb)))
    (is (seq (:required-evidence sb)))
    (is (some? (facts/corporate-number-spec-basis "PNG")))
    (is (some? (facts/foreign-enterprise-spec-basis "PNG")))))

(deftest png-rep-spec-basis-is-honestly-absent
  (testing "no representative/local-agent provision was confirmed in any source fetched this session -- deliberately not claimed"
    (is (nil? (facts/rep-spec-basis "PNG")))))

(deftest unknown-jurisdiction-has-no-spec-basis
  (is (nil? (facts/spec-basis "ATL")))
  (is (nil? (facts/spec-basis "ZZZ"))))

(deftest required-evidence-satisfied
  (let [sb (facts/spec-basis "PNG")
        all (:required-evidence sb)]
    (is (true? (facts/required-evidence-satisfied? "PNG" all)))
    (is (not (facts/required-evidence-satisfied? "PNG" (take 1 all))))
    (is (nil? (facts/required-evidence-satisfied? "ATL" all)))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["PNG" "USA" "ATL"])]
    (is (= 3 (:requested c)))
    (is (= 2 (:covered c)))
    (is (= ["ATL"] (:missing-jurisdictions c)))))

(deftest foreign-enterprise-spec-basis-criteria
  (let [fe (facts/foreign-enterprise-spec-basis "PNG")]
    (is (= 0.50 (get-in fe [:foreign-enterprise-criteria :foreign-enterprise-ownership-threshold-pct])))
    (is (= 14 (get-in fe [:foreign-enterprise-criteria :certification-deadline-days])))))
