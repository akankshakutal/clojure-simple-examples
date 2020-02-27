(ns clojure-example.cube
  (:require [clojure-example.square :refer :all]))

(defn cube
  [number]
  (-> (square number)
      (* number)))