(ns clojure-example.fibonacci-term)

(defn fibonacci-step
  [[a b]]
  [b (+ a b)])

(defn fibonacci
  [n]
  (last (take n (map first (iterate fibonacci-step [0 1])))))


