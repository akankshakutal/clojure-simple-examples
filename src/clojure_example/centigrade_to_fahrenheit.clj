(ns clojure-example.centigrade-to-fahrenheit)

(defn centigrade-to-fahrenheit
  [centigrade]
  (-> (* centigrade 1.8)
      (+ 32)))