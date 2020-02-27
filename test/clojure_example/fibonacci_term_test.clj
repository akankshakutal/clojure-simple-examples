(ns clojure-example.fibonacci-term-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.fibonacci-term :refer [fibonacci]]))

(deftest fibonacci-test
  (testing "fibonacci"
    (is (= 3 (fibonacci 5)))))
