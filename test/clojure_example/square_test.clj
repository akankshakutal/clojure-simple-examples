(ns clojure-example.square-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.square :refer :all]))


(is (= 16 (square 4)))
(is (= 25 (square 5)))