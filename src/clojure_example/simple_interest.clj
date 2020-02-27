(ns clojure-example.simple-interest)

(defn simple-interest
  [principle time rate]
  (-> (* principle time rate)
      (* 1.0)
      (/ 100)))
