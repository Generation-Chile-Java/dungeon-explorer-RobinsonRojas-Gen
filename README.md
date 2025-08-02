[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/vov8w5Ad)

**Objetivo del Ejercicio**

Desarrollar un juego de exploración de mazmorras en Java que utilice los cuatro pilares de la programación orientada a objetos: encapsulación, herencia, polimorfismo y abstracción. El juego debe incluir clases, interfaces y la interacción entre diferentes tipos de objetos en la mazmorra.


**Descripción del Juego**

El jugador debe explorar una mazmorra compuesta de diferentes tipos de salas. Cada sala puede estar vacía, contener un tesoro o albergar un enemigo. El jugador debe navegar por estas salas, recoger objetos y enfrentarse a enemigos, todo mientras intenta mantenerse con vida.


**Reglas del Juego**

1- El jugador comienza con un nombre y una cantidad inicial de puntos de vida.

2- El jugador puede moverse a través de varias salas en la mazmorra.

3- Las salas pueden ser de tres tipos: vacía, con tesoro o con enemigo.

4- El jugador puede recoger tesoros que se añaden a su inventario.

5- El jugador puede recibir daño de los enemigos y perder puntos de vida.

6- El juego termina cuando el jugador ha explorado todas las salas o ha perdido todos sus puntos de vida.



**Requisitos Técnicos**

1- Interfaces y Abstracción: Define interfaces para las salas y los objetos interactuables en el juego.

2- Encapsulación: Utiliza atributos privados y métodos públicos para manejar el estado del jugador y de las salas.

3- Herencia: Crea clases concretas que implementen las interfaces definidas para representar diferentes tipos de salas.

4- Polimorfismo: Usa referencias de las interfaces para manejar los diferentes tipos de salas y objetos en el juego.



**Especificaciones Detalladas**

Paso 1: Crear las interfaces básicas
  - Define una interfaz Room para representar una sala en la mazmorra.
  - Define una interfaz GameObject para representar objetos interactuables en la mazmorra.

Paso 2: Crear la clase Player
  - Define una clase Player que encapsule los datos y comportamientos del jugador.
  - La clase debe incluir atributos como name, health, e inventory.
  - Proporciona métodos para que el jugador pueda recibir daño, recoger objetos y mostrar su estado actual.

Paso 3: Crear clases concretas de Room
  - Crea una clase EmptyRoom que represente una sala vacía.
  - Crea una clase TreasureRoom que represente una sala con un tesoro.
  - Crea una clase EnemyRoom que represente una sala con un enemigo.

Paso 4: Crear la clase principal del juego
  - Define una clase principal que inicialice el jugador y una serie de salas.
  - Implementa un bucle que permita al jugador moverse por las salas.
  - Maneja las interacciones del jugador con las salas y los objetos.

**Instrucciones Adicionales**
  - Asegúrate de manejar adecuadamente las interacciones entre el jugador y los diferentes tipos de salas.
  - Considera agregar más salas y enemigos para hacer el juego más interesante.
  - Puedes implementar características adicionales como la posibilidad de que el jugador use objetos del inventario.

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Por falta de tiempo, motivación, y poco interés en utilizar mi creatividad en una actividad que no generará remuneración, decidí intentar generar distintos programas gracias a las herramientas de inteligencia artificial ChatGPT y DeepSeek, en mi "estudio" de lo recibido en base a mis prompts, me dí cuenta que Chatgpt genera soluciones con poca interacción por parte del usuario, solicitando ingresos de 1 solo botón, sin variedad de opciones, en cambio, DeepSeek fue más proactivo, e incluyó la opción de elegir distintas formas de interactuar con el programa. Cuando esta asignación fue entregada, no se me ocurrió la forma de realizarla basada en una idea propia, o inspiración de alguna saga o marca, pero en las últimas 2 semanas, recordé la existencia del juego y leyenda urbana "Slenderman". Caí en cuenta de que la jugabilidad era muy parecida a lo que era solicitado en la asignación, por lo que decidí que en caso de hacer mi "juego" inspirado en una franquicia, sería esta. Luego de recibir los códigos creados por ambas inteligencias, intenté repetir el prompt, pero esta vez solicitando que fueran isnpirando en esta idea, ChatGPT fue capaz de generar un resultado, pero al igual que en el intento anterior, con poca interacción del usuario... Por otro lado, al intentarlo con DeepSeek, el resultado no fue el que esperaba, no me dió un código completo, ya que era más extenso que el anterior, con bastante profundidad en relación a la franquicia que pedí, pero lamentablemente, como no soy usuario de pago, el espacio otorgado para recibir mi solicitud no fue el suficiente.

En lo personal, si hubiera tenido más tiempo y motivación, la forma en la que habría desarrollado el ejercicio habría sido con la inclusión de inputs "WASD", permitiendo al usuario moverse en 4 distintas direcciones, con posibilidad de 8 (ej. arriba izquierda).
También habría incluido la posiblidad de mantener objetos en el inventario y poder utilizarlos a través de la aventura. También me llamó la atención la posibilidad de generar interfaces visuales más avanzadas.

Finalmente, hice un último intento con ChatGPT, solicitando más interacción con el usuario, y la posibilidad de utilizar objetos a gusto propio. Aunque me otorgó lo que solicité, tenía varias fallas destacablas, como el hecho de que al obtener un nuevo objeto, se presentaba como el único disponible en el inventario, deshaciendose de los demás. También, el inicio fue mucho más frio y con menos humanidad, solicitando solamente un ingreso de nombre, sin ninguna bienvenida ni juego de rol.

Cabe destacar que a la hora de recibir estas soluciones, la más fácil de armar o "importar" fueron las generadas por Chatgpt, ya que cada archivo incluía los "imports" necesarios de cada librería, en cambio, DeepSeek fallaba en este áspecto, obligando al usuario a introducir estas líneas de código manualmente.

Los códigos fueron bastante cortos a mi parecer, el juego suele terminar al encontrar 8 páginas, pero las manejadas en estas soluciones no superan las 4.

Los prompts utilizados: 

CHATGPT, primer intento, sin temática especificada: hola chat gpt, puedes generar un código que resuelva esta asignación: *asignación incluida en el README*
CHATGPT, segundo intento, inspirado en Slenderman: hola chat gpt, puedes generar un código, inspirado en Slenderman, que resuelva esta asignación: *asignación incluida en el README*
CHATGPT, último intento, solicitando mayor interacción y manejo de objetos en el inventario: hola chat gpt, puedes generar un código, inspirado en Slenderman, que permita distinto tipos de inputs (ingresos del usuario), y que entregue la posibilidad de interactuar con objetos en el inventario a deseo del usuario. que resuelva esta asignación: *asignación incluida en el README*

DeepSeek, primer intento, sin temática especificada: hola deepseek, puedes realizar un código que resuelva esta asignación: *asignación incluida en el README*
DeepSeek, segundo intento, inspirado en Slenderman: hola deepseek, puedes realizar un código, inspirado en Slenderman que resuelva esta asignación: *asignación incluida en el README* - devuelve código incompleto
