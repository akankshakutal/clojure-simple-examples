(ns clojure-example.odd-number
  (:require [clojure-example.even-number :refer [is-even]]))

(def is-odd (comp not is-even))