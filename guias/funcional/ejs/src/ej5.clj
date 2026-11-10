; quicksort
; tomamos un pivote y metemos en una lista los menores al pivote,
; en otra lista a los mayores y luego las juntamos


(defn quicksort [l]
  (if (empty? l)
    '()
    ; usamos f[0] como pivote
    (let [ f (first l)
          mayores (filter #(>= % f) (rest l))
          menores (filter #(< % f) (rest l))
          ]
      (concat (quicksort menores) [f] (quicksort mayores)))))

; [4, 1, 3, 6, 2, 5]
; 1. (qsort [1,3,2])+[4]+(qsort [6, 5])
; 2. qsort [1,3,2] = [1]+(qsort [3, 2]), qsort [6, 5] = (qsort [5])+[6]
; 3. qsort [3, 2] = (qsort [2])+[3]
; 4. [1,2,3,4,5,6]

(println (quicksort [4, 1, 3, 6, 2, 5, 10, 9, 8, 7, 11, 12, 13, 15, 20, 21, 22]))