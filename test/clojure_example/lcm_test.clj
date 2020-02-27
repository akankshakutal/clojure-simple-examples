(ns clojure-example.lcm-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.lcm :refer [lcm]]))

(deftest lcm-test
  (testing "lcm"
    (is (= 60 (lcm 20 15)))))
