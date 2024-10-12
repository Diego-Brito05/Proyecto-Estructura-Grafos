Requerimientos Funcionales:

Debe realizar un programa en Java utilizando la librería de interfaces gráficas de Java Swing que permita:

1.Cargar una nueva Red de Transporte desde un archivo: El programa debe, en cualquier momento, poder cargar un archivo con una red de transporte. Si ya hay una red cargada, el programa deberá reemplazar la que se cargó anteriormente con la que se encuentra en el archivo.

2.Mostrar grafo: El programa deberá mostrar el grafo correspondiente. Se sugiere utilizar GraphStream (https://graphstream-project.org/).

3.Establecer t: Debe ser posible, en cualquier momento, cambiar el valor de t para poder evaluar escenarios alternos (por ejemplo, Caracas con t = 2). Todas las revisiones de cobertura sucesivas deben realizarse con el nuevo valor de t hasta que vuelva a ser cambiada.

4.Colocar sucursal: Debe ser posible seleccionar cualquiera de las paradas de la red de transporte y establecerla como la ubicación de una futura sucursal.
Debe ser posible des-seleccionar la parada.

5.Ver cobertura de sucursal: Debe ser posible seleccionar una sucursal colocada y ver cuáles paradas son alcanzables desde la misma dentro del límite t.
Se debe poder especificar que el programa realice esta revisión con Búsqueda en Profundidad (DFS por sus siglas en inglés)
Se debe poder especificar que el programa realice esta revisión con Búsqueda en Amplitud (BFS por sus siglas en inglés)

6.Revisar cobertura total: Cada vez que se coloque una sucursal, el programa deberá revisar si, con este cambio, el total de las sucursales colocadas cubre totalmente la ciudad.
Si las sucursales colocadas cubren totalmente la ciudad, el programa debe indicarlo.
Si la cobertura no es total, el programa debe sugerir, de entre las paradas no cubiertas por ninguna sucursal, dónde colocar las sucursales para lograr la cobertura total. 
Los requerimientos 5.a y 5.b solo deben realizarse cuando hay al menos una sucursal seleccionada y debe indicarse en el grafo dibujado.

7.Agregar línea: Debido a que las redes están en constante expansión, el programa debe permitir agregar líneas nuevas a la red para evaluar si, cuando las mismas estén completadas, se logrará la cobertura completa (por ejemplo, la propuesta Línea 6 que conectaría las estaciones Zoológico y La Rinconada—mostrada en rojo en la siguiente figura—puede hacer innecesario que ambas tengan una sucursal). Tome en cuenta que agregar una línea es en realidad agregar una secuencia de paradas.

Requerimientos técnicos:

1.Debe tener una clase grafo, la cual se debe representar la red de transporte y debe ser utilizada para responder a los requerimientos funcionales. El grafo debe ser implementada con una matriz de adyacencia o una lista de adyacencia.

2.Puede utilizar cualquier otra estructura auxiliar de ser necesario para mejorar los tiempos de respuesta del programa. Sin embargo, NO podrá utilizar librerías para la implementación del tipo de dato abstracto.

3.La aplicación debe ofrecer una interfaz gráfica al usuario. No se permite la entrada ni la salida de información por consola. Debe investigar independientemente cómo usar la librería Java Swing.

4.El programa debe poder cargar un archivo de texto para la lectura de datos. Para ello, es requerido el uso del componente JFileChooser.

5.Debe documentar el proyecto con Javadoc.

6.Junto al programa, cada equipo deberá presentar un Diagrama de clases (arquitectura detallada) que explique la solución obtenida. El diagrama de clases se deberá incluir como un archivo PDF en el repositorio de código 

7.Los equipos de trabajo deberán utilizar GitHub para el control de versiones y facilitar el trabajo en equipo de manera asíncrona. De esta forma, podrán comenzar a crear su portafolio de trabajos, elemento que puede ser importante a la hora de buscar trabajo. En el registro se deberá reflejar la participación activa y significativa de los integrantes. 
