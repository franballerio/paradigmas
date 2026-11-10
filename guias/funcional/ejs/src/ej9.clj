(defn rutas [m n]
  (cond
  (and (= 0 m) (= 0 n)) '("")
  (= 0 m) (map #(str "d" %) (rutas 0 (dec n)))
  (= 0 n) (map #(str "a" %) (rutas (dec m) 0))
  :else (concat
          (map #(str "d" %) (rutas m (dec n)))
          (map #(str "a" %) (rutas (dec m) n)))))

(println (rutas 2 2))
(println (rutas 1 1))
(println (rutas 2 1))
(println (rutas 3 3))

