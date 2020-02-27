(ns clojure-example.sum-til-nth-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.sum-til-nth :refer [sum-til-nth]]))


(deftest sum-til-nth-test
  (testing "sum-til-nth"
    (is (= 15 (sum-til-nth 5)))))
