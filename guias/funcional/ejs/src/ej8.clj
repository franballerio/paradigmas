; 1 + max(profundidad para cada elem de la lista)

(defn profundidad [l]
  (cond
    (not (coll? l)) 0
    (empty? l) 0
    :else (inc ())
    ))

(println (profundidad '((2))))