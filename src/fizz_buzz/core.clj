(ns fizz-buzz.core)
(defn compute
  [number]
  (cond
    (true? (zero? (+ (mod number 5) (mod number 3)))) "FizzBuzz"
    (true? (true? (and (zero? (mod number 5)) (not (zero? (mod number 3)))))) "Buzz"
    (true? (true? (and (zero? (mod number 3)) (not (zero? (mod number 5)))))) "Fizz"    
    :else number))

(defn fizz-buzz
  [& rest]
  (let [numbers (or rest (range 1 101))]
    (if (> (count numbers) 1)
      numbers
      (compute (first numbers)))))
