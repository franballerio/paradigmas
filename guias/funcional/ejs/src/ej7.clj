
(defn pangrama? [p]
      (let [freqs (frequencies p)
            alph "abcdefghijklmnopqrstuvwxyz"]
           (every? (fn [ch] (<= 1 (get freqs ch 0))) alph)))

; (println (pangrama "abcdefghijklmnopqrstuvwxyz"))
(assert (= true (pangrama? "abcdefghijklmnopqrstuvwxyz")))