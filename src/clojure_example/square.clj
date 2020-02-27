(ns clojure-example.square
  (:require [clojure-example.square :refer []]))

(def square (comp (partial apply *) (partial repeat 2)))