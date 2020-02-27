(ns clojure-example.sum-til-nth)

(defn sum-til-nth
  [nth-term]
  (-> (inc nth-term)
      (* nth-term)
      (/ 2)))

