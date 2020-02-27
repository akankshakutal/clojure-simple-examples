(ns clojure-example.gcd)

(defn gcd
  [a b]
  (if (zero? b) a (recur b (mod a b))))
