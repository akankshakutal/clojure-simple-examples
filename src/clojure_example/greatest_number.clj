(ns clojure-example.greatest-number)

(defn greater-number
  ([a] a)
  ([a b] (if (< a b) b a)))

(defn greatest-number
  [& a]
  (reduce greater-number a))
