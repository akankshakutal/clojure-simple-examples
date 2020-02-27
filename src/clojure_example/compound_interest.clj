(ns clojure-example.compound-interest)

(defn compound-interest
  [p r n t]
  (-> (/ r n)
      (+ 1)
      (Math/pow (* n t))
      (* p)
      (.floatValue)))
