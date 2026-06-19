

## 1. Búsqueda de vehículos

En la versión anterior los vehículos se buscaban recorriendo una lista completa hasta encontrar la patente. Cuando la cantidad de vehículos aumenta, este proceso se vuelve más lento.

Para mejorar el rendimiento utilizamos un HashMap, donde la patente funciona como clave. De esta forma el vehículo puede encontrarse de manera mucho más rápida sin recorrer toda la colección.

---

## 2. Eliminación de alertas GPS repetidas

Los dispositivos GPS pueden enviar coordenadas repetidas por errores de comunicación.

Para solucionar este problema utilizamos un HashSet. Esta estructura no permite guardar elementos duplicados, por lo que las coordenadas repetidas se eliminan automáticamente.

Gracias a esto se evita comparar cada coordenada con todas las demás y el proceso es mucho más eficiente.

---

## 3. Ordenamiento de vehículos

El sistema necesita ordenar los vehículos de dos formas diferentes.

### Ordenamiento por batería

Se implementó mediante Comparable dentro de la clase Vehiculo.

Este ordenamiento muestra primero los vehículos con menor porcentaje de batería, ya que son los que necesitan recargarse antes.

### Ordenamiento por tarifa

Se implementó mediante Comparator utilizando la clase TarifaComparator.

Este criterio permite ordenar los vehículos según su tarifa base de mayor a menor sin modificar el criterio principal basado en batería.

---

## 4. Patrón State

Para controlar el estado de los monopatines se utilizó el patrón State.

Los estados implementados son:

* EnEspera
* EnViaje
* EnReparacion

Esto permite representar mejor la situación actual de cada vehículo y facilita agregar nuevos estados en el futuro.

---

## 5. Patrón Strategy

Para calcular el costo de los viajes se utilizó el patrón Strategy.

Se implementaron tres estrategias:

* TarifaEstandar
* TarifaHoraPico
* TarifaClima

Cada una calcula el costo de una manera diferente. Esto permite cambiar la forma de calcular la tarifa sin modificar el resto del sistema.

---

## Conclusión

Con estas modificaciones el sistema es más rápido, más ordenado y más fácil de mantener. Además, se aplicaron los patrones de diseño solicitados en la consigna y se mejoró el rendimiento utilizando estructuras de datos más eficientes.
