(ns clojure-example.even-number-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.even-number :refer [is-even]]))



(deftest is-even-test
  (testing "is even"
    (is (true? (is-even 4)))
    (is (false? (is-even 5))))
  )
