(ns clojure-example.centigrade-to-fahrenheit-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.centigrade-to-fahrenheit :refer [centigrade-to-fahrenheit]]))

(deftest centigrade-to-fahrenheit-test
  (testing "centigrade to fahrenheit"
    (is (= (float 104.0) (centigrade-to-fahrenheit 40)))))
