(ns clojure-example.simple-interest-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.simple-interest :refer [simple-interest]]))


(deftest simple-interest-test
  (testing "SI"
    (is (= 1.2 (simple-interest 4 5 6)))))
