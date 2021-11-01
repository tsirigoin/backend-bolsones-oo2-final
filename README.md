# backend-bolsones-oo2-final
### Casos de uso resumidos para acordar el alcance funcional

  En la materia laboratorio de sw se realizará un frontend (una aplicación android) que sirva para el armado de los bolsones de productos agroecológicos. La aplicación básicamente reemplaza planillas que se llenan a mano y recopilan qué cultivos están sembrados en cada quinta. Sin embargo nos comentaron que no contaremos con un backend, que debemos suponer que existe.
  
  La idea nuestra es realizar dicho backend. Las funciones principales serán:
  * Agregar productores
  * Cargar los datos de los cultivos que cada uno está produciendo en determinado momento (esta información se actualiza cada dos semanas)
  * Cargar un arreglo por productor, indicando que productos ofrecerá para bolsónes. Este arreglo debe tener 7 variedades, de las cuales 5 como mínimo deben ser propias del productor, y las dos restantes pueden ser compradas a otro productor. También debe indicar la cantidad de bolsones que producirá esa semana. A la hora de cargar dicho arreglo en el sistema se validan los datos para que sean coherentes con la base de datos de cultivos en cosecha. Es decir, se sabe qué cultivos tiene cada productor listo para ser cosechado, entonces se puede saber cuáles de los productos en su propuesta son propios y cuáles no.
  * Obtener los totales de cada semana. Es decir todas las variedades de verduras que van a estar disponibles en los bolsones, y la cantidad de bolsones disponibles.

### Resultado esperado
* Que el producto resultante sea fácilmente adaptable a lo sea que espere recibir el fontend.
* Que se puedan persistir los datos en una base de datos sql.

### Justificación de cómo el alcance y resultado esperados ponen a prueba las competencia y conceptos vistos en la asignatura (en particular refactoring, patterns, frameworks, TDD)
Utilizaremos TDD en el desarrollo de la aplicación. Todo lo aprendido de refactoring será implementado para que el producto final sea fácilmente entendible y modificable por otras personas. Para el modelado de datos deberemos utilizar distintos patrones, que determinaremos al estudiar un poco más a fondo el dominio. Sabemos que tendrémos que realizar conversiones de unidades por ejemplo de "cantidad surcos de un cultivo en invernáculo" a kg finales del producto, lo que variará según cada uno y habrá que tener en cuenta ciertos márgenes de error. Podremos utilizar herencia para agrupar cultivos que compartan características. Pensamos usar el framework Spring, más específicamente Hibernate para la comunicación con la base de datos.
