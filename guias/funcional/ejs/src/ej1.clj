; Definir la función segundos que reciba los cuatro valores (días, horas, minutos y segundos) del tiempo que dura un evento
; y devuelva el valor de ese tiempo expresado solamente en segundos.

; 1min = 60s
; 1hs = 60min = 3600s
; 1 dia = 24hs = 1440min = 86400s

(defn segundos [dias horas minutos segundos]
      (+ (* dias 86400)
         (* horas 3600)
         (* minutos 60)
          segundos))

(println (segundos 1 10 0 0))