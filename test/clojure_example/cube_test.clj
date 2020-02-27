(ns clojure-example.cube-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.cube :refer [cube]]))




(deftest cube-test
  (testing "Cube"
    (is (= 8 (cube 2)))
    (is (= 27 (cube 3))))
  )
