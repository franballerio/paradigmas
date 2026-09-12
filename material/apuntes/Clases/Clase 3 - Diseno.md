---
Date: 2026-08-31
tags:
  - Paradigmas
  - OOP
  - Design
---
---

#### Algunas definiciones rapidas
- **code smell:** indicio de que el codigo no esta bien
- **technical debt / deuda tecnica:** costo implicito del trabajo adicional que necesita el codigo. Se da por elegir soluciones mas faciles y rapidas por sobre soluciones robustas
- **Refactoring**: reestructuracion del codigo para mejorar su legibilidad, mantenibilidad y escalabilidad. Sin cambiar su comportamiento.

---
# Principios

## YAGNI (You ain't gonna need it)
Solo agregar funcionalidades que alguien pide.
Si nadie lo pidio, no lo hagas, no lo vas a necesitar.
## KISS (Keep it simple, stupid)
Tratar de eliminar la mayor cantidad de complejidad posible.
## DRY (Don't repeat yourself)
Evitar el codigo y logica duplicada
La idea principal es refactorizar codigo repetido en modulos reutilizables. Cosa de que al querer modificar el comportamiento solo se deba modificar en un lugar.
## POLA (Principle of least astonishment)
El sistema debe comportarse como es de esperarse.
## KOP (Knut's optimization principle)
La optimizacion prematura del codigo es la raiz de todos los males.
Refuerza el principio **KISS**
## SOC (Separation of concerns)
Dividir el sistema en partes independientes que se encargan de tareas o tienen dominios separados.
No mezclar logica y generar dependencias sobre modulos.
## Alta Cohesion + Bajo Acoplamiento
Los modulos se complementen y esten cercanos para poder cumplir un proposito (Alta Cohesion). Pero que entre ellos no generen dependencias el uno del otro logrando mayor reutilizacion, y mejor mantenimiento y testeo.
## Tell Don't Ask
Pedirle a un objeto que haga algo. No solicitar su estado y en base a eso ejecutar una accion.
## POLK (Principle of least knowledge)
## EDP (Explicit Deps Principle)
Clases y metodos deben requerir explicitamente las dependencias que necesitan para accionar correctamente.
## SOLID
- **Single Responsibility**
- **Open-Closed** --> clases abiertas a extension pero cerradas a modificacion (Agregar funcionalidades sin modificar el codigo)
- **LSP** (Liskov sustitution principle) --> Una instancia de una clase debe poder ser sustituida por una instancia de una clase hija (derivada de la original).
- **ISP** --> una clase no debe depender de metodos de otras clases que no utiliza.
- **DIP (Deps Inversion Principle)** -->  clases de alto nivel no deben depender de las de bajo nivel, deben depender de las abstracciones.
## Composicion por sobre herencia
![[composicion_vs_herencia.png]]
## 
