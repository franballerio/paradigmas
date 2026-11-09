# 📚 Guía de Ejercicios de Programación Funcional

> **Convención:** Los nombres de funciones y ejemplos siguen las convenciones estándar de Lisp/Clojure/Scheme (notación *kebab-case*, predicados terminados en `?` y listas entre paréntesis).

---

### 1. Conversión de tiempo a segundos

Definir la función `segundos` que reciba cuatro valores enteros no negativos correspondientes a días, horas, minutos y segundos de duración de un evento, y devuelva la duración total expresada únicamente en segundos.

* **Firma:** `(segundos dias horas minutos segs)`
* **Ejemplos:**
  ```clojure
  (segundos 0 1 0 0)    ; → 3600
  (segundos 1 2 30 15)  ; → 95415
  (segundos 0 0 0 45)   ; → 45
  ```

---

### 2. Verificación de número capicúa

Definir el predicado `capicua?` que reciba un número entero no negativo de hasta 5 dígitos ($0 \le n \le 99999$) y determine si es capicúa (se lee igual de izquierda a derecha que de derecha a izquierda).

* **Firma:** `(capicua? n)`
* **Retorno:** `true` si es capicúa; `false` en caso contrario.
* **Ejemplos:**
  ```clojure
  (capicua? 12321)  ; → true
  (capicua? 4004)   ; → true
  (capicua? 7)      ; → true
  (capicua? 12345)  ; → false
  ```

---

### 3. Aproximación de $\pi$ (Serie de Leibniz)

Definir la función `aprox-pi` que calcule una aproximación del número $\pi$ a partir de la cantidad $k$ de términos a evaluar en la serie de Leibniz:

$$4 \cdot \sum_{i=1}^{k} \frac{(-1)^{i-1}}{2i - 1} = 4 \cdot \left( 1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \dots + \frac{(-1)^{k-1}}{2k - 1} \right)$$

* **Firma:** `(aprox-pi k)`
* **Parámetros:** `k` (entero positivo mayor a cero).
* **Ejemplos:**
  ```clojure
  (aprox-pi 1)     ; → 4.0
  (aprox-pi 4)     ; → 2.8952380952380956
  (aprox-pi 1000)  ; → 3.140592653839794
  ```

---

### 4. Término $n$-ésimo de Fibonacci

Definir la función `nth-fibo` que reciba un número entero no negativo $n$ y devuelva el término correspondiente de la sucesión de Fibonacci, donde $F(0) = 0$ y $F(1) = 1$.

* **Firma:** `(nth-fibo n)`
* **Ejemplos:**
  ```clojure
  (nth-fibo 0)  ; → 0
  (nth-fibo 1)  ; → 1
  (nth-fibo 6)  ; → 8
  (nth-fibo 10) ; → 55
  ```

---

### 5. Algoritmo Quicksort

Definir la función `qsort` que reciba una secuencia de elementos comparables y devuelva una nueva colección con los elementos ordenados ascendentemente mediante el algoritmo **Quicksort**.

* **Firma:** `(qsort coleccion)`
* **Ejemplos:**
  ```clojure
  (qsort '(5 2 9 1 5 6))  ; → (1 2 5 5 6 9)
  (qsort '())             ; → ()
  (qsort '(42))           ; → (42)
  ```

---

### 6. Subcadenas contiguas (`slice`)

Definir la función `slice` que reciba una cadena de caracteres `s` y un número entero positivo `n`, y devuelva una lista con todas las subcadenas contiguas de longitud `n` presentes en `s` (conservando el orden de aparición).

* **Firma:** `(slice s n)`
* **Ejemplos:**
  ```clojure
  (slice "abcde" 3)  ; → ("abc" "bcd" "cde")
  (slice "hola" 1)   ; → ("h" "o" "l" "a")
  (slice "test" 5)   ; → ()
  ```

---

### 7. Detección de pangrama

Definir el predicado `pangrama?` que reciba una frase (cadena de texto) y determine si contiene todas las letras del alfabeto al menos una vez (omitiendo mayúsculas/minúsculas y signos de puntuación).

* **Firma:** `(pangrama? frase)`
* **Retorno:** `true` si es un pangrama; `false` en caso contrario.
* **Ejemplos:**
  ```clojure
  (pangrama? "Fabio me exige, sin tapujos, que añada cerveza al whisky")
  ; → true

  (pangrama? "El veloz murciélago hindú comía feliz cardillo y kiwi")
  ; → true

  (pangrama? "Esta es una frase cualquiera")
  ; → false
  ```

---

### 8. Profundidad de una lista anidada

Definir la función `profundidad` que calcule el nivel máximo de anidamiento de una lista recursiva. Los elementos atómicos en el nivel raíz tienen profundidad 1.

* **Firma:** `(profundidad lista)`
* **Ejemplos:**
  ```clojure
  (profundidad '())                    ; → 0
  (profundidad '(1 2 3))               ; → 1
  (profundidad '((2 3) (3 ((7))) 5))   ; → 4
  ```

---

### 9. Rutas en una cuadrícula

Comenzando en la esquina superior izquierda de una grilla de $M \times N$ casillas, y con la restricción de moverse únicamente hacia la **derecha** (`d`) o hacia **abajo** (`a`), calcular todas las rutas posibles hasta la esquina inferior derecha.

Definir la función `rutas` que reciba las dimensiones de la grilla ($M$ filas y $N$ columnas) y devuelva una colección con todas las trayectorias posibles representadas como cadenas.

* **Firma:** `(rutas m n)`
* **Ejemplos:**
  ```clojure
  ;; Grilla de 2x2 casillas (da lugar a 6 rutas posibles):
  (rutas 2 2)
  ; → ("ddaa" "dada" "daad" "adda" "adad" "aadd")

  (rutas 1 1)
  ; → ("da" "ad")
  ```

---

### 10. Simulación del Juego de la Vida

Implementar un programa interactivo que simule el [Juego de la Vida de Conway](https://es.wikipedia.org/wiki/Juego_de_la_vida).

#### Requisitos:
1. **Representación:** Una cuadrícula bidimensional de células vivas (ej. `■` o `#`) y muertas (ej. `□` o `.`).
2. **Reglas de transición de estado:**
   - Una célula viva con menos de 2 vecinas vivas muere (subpoblación).
   - Una célula viva con 2 o 3 vecinas vivas sobrevive a la siguiente generación.
   - Una célula viva con más de 3 vecinas vivas muere (sobrepoblación).
   - Una célula muerta con exactamente 3 vecinas vivas se convierte en una célula viva (reproducción).
3. **Interacción por consola:**
   - Cargar un estado inicial (tablero predeterminado o aleatorio).
   - Imprimir el estado actual del tablero en consola.
   - Avanzar a la siguiente generación cada vez que el usuario presione la tecla <kbd>Enter</kbd>.
