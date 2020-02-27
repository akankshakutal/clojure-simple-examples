(ns clojure-example.is-prime?)

(defn is-prime? [number]
                (->> (range 2 (inc (Math/sqrt number)))
                     (filter (fn [x] (zero? (rem number x))))
                     (first)
                     (nil?)))

(defn is-prime? [number]
                (->> (range 2 (inc (Math/sqrt number)))
                     (drop-while (fn [x] (complement (zero? (rem number x)))))
                     (empty?)
                     ))


(defn is-prime? [number]
                (->> (int (inc (Math/sqrt number)))
                     (range 2)
                     (drop-while (comp not zero? (partial rem number)))
                     (empty?)))


(defn divisible? [a b]
                 (zero? (rem a b)))

(defn is-prime? [number] (not-any? (partial divisible? number) (range 2 number)))

(keep-indexed #(if ((complement zero?) (rem (+ %1 1) 2)) %2) [:a :b :c :d :e])

(defn isPrime?
  [n]
  (let [divisors (range 2 (inc (int (Math/sqrt n))))
        remainders (map #(mod n %) divisors)]
    (not-any? #(= % 0) remainders)))

(defn is-prime
  [number]
  (->> (range 2 (inc (Math/sqrt number)))
       (filter (fn [x] (zero? (rem number x))))
       (first)
       (nil?)))