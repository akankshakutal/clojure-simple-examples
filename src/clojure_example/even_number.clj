(ns clojure-example.even-number)

(defn is-even
  [number]
  (zero? (rem number 2)))
