(ns clojure-example.fahrenheit-to-centigrade)

(defn fahrenheit-to-centigrade
  [fahrenheit]
  (-> (- fahrenheit 32)
      (/ 1.8)
      (.floatValue)))
