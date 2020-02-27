(ns clojure-example.fahrenheit-to-centigrade-test
  (:require [clojure.test :refer :all])
  (:require [clojure-example.fahrenheit-to-centigrade :refer [fahrenheit-to-centigrade]]))



(deftest fahrenheit-to-centigrade-test
  (testing "fahrenheit-to-centigrade"
    (is (= (float 4.4444447) (fahrenheit-to-centigrade 40)))))
