(ns clojure-example.greatest-number-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.greatest-number :refer :all]))



(deftest greatest-number-test
  (testing "greatest-number"
    (is (= 7 (greatest-number 5 2 7)))))
