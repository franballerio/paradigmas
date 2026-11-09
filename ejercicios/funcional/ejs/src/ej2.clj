;Definir la función capicua?
; que reciba un número entero no negativo de hasta 5 dígitos
; y devuelva true si el número es capicúa; si no, false.
; capicua = se lee igual de der a izq que de izq a der

; 5 digitos = 10000 --> 0 < k/10000 < 9
; 0 <= K <= 9          -> true
; 10 <= K <= 99        -> k1 == k2
; 100 <= K <= 999      -> k1 == k3
; 1000 <= K <= 9999    -> k1 == k4, k2 == k3
; 10000 <= K <= 99999  -> k1 == k5, k2 == k4

(defn capicua_aux? [num]
      (let [s (str num)]
        (= s (apply str (reverse s)))))

; capicua? es para cuando la funcion devuelve un bool
(defn capicua? [num]
      (if (and (<= 0 num) (<= num 99999))
        (capicua_aux? num)
        (println "Numero negativo o con mas de 5 digitos")))

(println (capicua? 1))
(println (capicua? 200))
(println (capicua? 202))
(println (capicua? 100000))
