(ns clojure-example.compound-interest-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.compound-interest :refer [compound-interest]]))


(deftest compound-interest-test
  (testing "compound interest"
    (is (= (.floatValue 2892.5466) (compound-interest 100 2 5 2)))
    )
  )
