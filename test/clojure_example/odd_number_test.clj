(ns clojure-example.odd-number-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.odd-number :refer [is-odd]]))

(is (true? (is-odd 5)))
(is (false? (is-odd 4)))
