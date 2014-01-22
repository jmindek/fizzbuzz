(ns fizz-buzz.core-spec
  (:require [speclj.core :refer :all]
            [fizz-buzz.core :refer :all]))

(describe "fizz-buzz"
  (it "processes 100 things if no parameter exists"
    (should= 100 (count (fizz-buzz))))
  (it "returns FizzBuzz for integers that are divisible by 3 AND 5"
    (should= "FizzBuzz" (fizz-buzz 15)))
  (it "returns Buzz for integers that are divisible by 5"
    (should= "Buzz" (fizz-buzz 5)))
  (it "returns Buzz for integers that are divisible by 3"
    (should= "Fizz" (fizz-buzz 3)))
  (it "returns the integer for integers that are not divisible by 3 or by 5"
    (should= 2 (fizz-buzz 2))))

(run-specs)
