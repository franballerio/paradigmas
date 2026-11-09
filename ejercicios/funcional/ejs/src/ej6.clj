; subcadenas contiguas de n elementos en una cadena de caracteres

(defn slice [string n]
  (if (= n 0)
    '()
    (loop [x (first string)
           xs (rest string)
           slices []]
      (if (and (>= (+ 1 (count xs)) n) (some? x))
        (recur (first xs) (rest xs) (conj slices (apply str x (take (- n 1) xs))))
        slices))))

; version funcional mas pro
(defn slice [string n]
  (if (<= n 0)
    '()
    (map #(apply str %) (partition n 1 string))))
; partition sirve para dividir una colección en grupos (o sublistas) de un tamaño determinado.
; Con paso / desplazamiento: (partition n step coleccion)
; Caso clave: step = 1 (Sliding Window) Al avanzar de a 1, los grupos se superponen.

; "abcde", 3
; x & xs --> "a" "bcde" (3-1)
; x & xs --> "b" "cde"
; len(xs) > 3-1

; (apply str (take (dec n) xs))

(println (slice "abcde" 3))
(println (slice "abcde" 2))
(println (slice "test" 5))
(println (slice "hola" 1))
