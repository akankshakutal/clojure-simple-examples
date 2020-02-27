(ns clojure-example.average-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.average :refer :all]))


(deftest average-test
  (testing "average"
    (is (= 23 (average 15 40 14)))))
