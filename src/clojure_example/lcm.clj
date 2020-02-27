(ns clojure-example.lcm
  (:require [clojure-example.gcd :refer :all]))

(defn lcm
  [a b]
  (->> (gcd a b)
       (/ (* a b))))