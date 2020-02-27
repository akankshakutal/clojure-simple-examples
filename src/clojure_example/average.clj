(ns clojure-example.average)

(defn average [& number]
              (-> (apply + number)
                  (* 1.0)
                  (/ (count number))))
