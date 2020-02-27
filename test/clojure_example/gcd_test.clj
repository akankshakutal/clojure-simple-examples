(ns clojure-example.gcd-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.gcd :refer :all]))

(deftest gcd-test
  (testing "gcd"
    (is (= 5 (gcd 20 15)))
    (is (= 15 (gcd 0 15)))
    (is (= 20 (gcd 20 0)))))
