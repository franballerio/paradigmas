(defn nth-fib [n]
  (loop [i 2
         anterior 0
         actual 1]
    (if (<= i n)
      (recur (inc i) actual (+ actual anterior))
      actual)))

(println (nth-fib 6))