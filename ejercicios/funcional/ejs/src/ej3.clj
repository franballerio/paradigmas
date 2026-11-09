; Definir la función aprox-pi que calcule una aproximación del número pi
; a partir de la cantidad k de términos a evaluar en la serie de Leibniz

(require '[clojure.math :as math])

(defn leibniz [k]
  (loop [i 1
         result 0]
    (if (<= i k)
      (recur (inc i) (+ result (/ (math/pow -1 (- i 1)) (- (* 2 i) 1))))
      result)))

(defn aprox-pi [k]
  (* 4 (leibniz k)))

(println (leibniz 1))
(println (leibniz 2))
(println (leibniz 20))
(println (leibniz 1000))

(println (aprox-pi 1))
(println (aprox-pi 4))
(println (aprox-pi 20))
(println (aprox-pi 1000))