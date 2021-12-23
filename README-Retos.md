# Scripts
This repository stores personal scripts that I find interesting and that help me improve my skills as a developer full stack.

##################File Reto 1
Un parque de diversiones cuenta con el servicio de reserva de almuerzos para los visitantes del lugar, ya que no es permitido ingresar alimentos al parque. Por esas razones se debe planear adecuadamente la cantidad de ingredientes para las preparaciones y la cantidad de personas que estarán asignados a prepararlos cada día.

El almuerzo consta de: una porción de arroz, trucha frita, jugo de piña y postre de lulo; además a cada comensal se le dará para llevar una porción de piña picada (para que coma como merienda mientras hace el recorrido del lugar después del almuerzo).  El parque debe hacer la compra de los ingredientes perecederos a diario (trucha, lulo y piña), de acuerdo con la cantidad de visitantes que hayan reservado su almuerzo, lo cual debe hacerse con un día de anticipación.

Según la cantidad de almuerzos reservados, se asignará de uno a cuatro empleados a la cocina para realizar las preparaciones.

La cantidad de truchas será una para cada almuerzo. Para calcular la cantidad de lulos a comprar, se ha determinado que serán el doble de la cantidad de personas que reservaron, más 4. En cuanto a las piñas, se calcula haciendo una suma entre la cantidad de personas a almorzar y la cantidad de lulos a comprar, dividido entre 5.

La cantidad de personas que se asignarán a la cocina depende del volumen de almuerzos a preparar y servir, por lo que para esta decisión se tendrá en cuenta una de las preparaciones del plato: la que se hace con piñas, ya que este ingrediente requiere más trabajo. Si la cantidad de piñas que se compró no pasa de 20 entonces será suficiente con un empleado en la cocina; si se compraron 30 piñas se requiere de dos empleados; si se llegara a comprar  hasta 50 piñas entonces se asignarán tres empleados; de tratarse de una cantidad mayor entonces se asignará el máximo de empleados posibles que es cuatro.

Con base en lo anterior, se espera que usted realice un programa en Java (La clase donde programe la solución se debe llamar Main) que permita determinar la cantidad de alimentos perecederos que se deben comprar para preparar los almuerzos : truchas, lulos y piñas. También debe indicar la cantidad de empleados a asignar para la cocina ese día (en texto).

Entrada

La entrada es un número entero que representa la cantidad de personas que reservaron almuerzo.

Salida

Tres números enteros separados por espacio, que representan la cantidad de: truchas, lulos y piñas que se deben comprar. En la siguiente línea, en letras, la cantidad de empleados a asignar a la cocina.


##########################File Reto 2

Reto 2: “Mi Buen VestiDeporTic

El almacén “Mi Buen VestiDeporTic” vende prendas de vestir para aquellos que quieren iniciar en el mundo del deporte o que les gusta lucir prendas deportivas. El almacén requiere un programa para tener almacenada la información de las prendas existentes y poder hacer las búsquedas de una manera más rápida.

Cada prenda de vestir tiene una referencia (int), un precio(double), un color (String) y talla (String) (S, M, L, XL).  En este momento el almacén sólo vende dos tipos de prendas: Leggin y camisetas.  De los leggin les interesa almacenar el largo(String) que puede ser uno de estos tres valores: cortos, medios y tobilleros;  Mientras que de las camisetas les interesa almacenar el tipo de manga (char): C para manga corta o S para manga sisa.

Le han encargado a usted que desarrolle un programa en Java, haciendo uso de la programación Orientada a Objetos, que implemente una solución siguiendo las especificaciones del siguiente diagrama de clases:

Procesar entrada
En la clase VestiDeporTic, se debe definir el método procesarEntrada que realiza las siguientes operaciones:

Agregar Prendas: Opción 1

Se puede añadir una Prenda de tipo Camiseta con el siguiente comando:

1&Camiseta&referencia&precio&color&talla&tipoManga

Ejemplo:

1&Camiseta&2123&55000&rojo&XL&S

 

Se puede añadir una prenda de tipo leggin con el siguiente comando:

1&Leggin&referencia&precio&color&talla&largo

Ejemplo:

1&Leggin&8238&65000&negro&M&tobillero

Listar ítems del inventario: Opción 2

Se debe mostrar la frase: “***Mi Buen VestiDeporTic***” Seguida por las prendas en el orden en el que fueron agregadas.

Si se trata de un leggin se mostrará así. Recuerde que \t implica correr el ítem unos espacios a la derecha:

\tPrenda Leggin - referencia: 8238
\tprecio: 65000
\tcolor: negro
\ttalla: M
\tlargo: tobillero
Si se trata de una camiseta se mostrará así:

\tPrenda Camiseta - referencia: 2123
\tprecio: 55000
\tcolor: rojo
\ttalla: XL
\tlargo: S
 Salir: Opción 3


Nota 1: Observe que el único comando que tiene salida es el listar.

Nota 2: En este ejercicio se requiere subir cuatro archivos. 

Uno correspondiente a la clase Prenda llamado Prenda.java,
otro correspondiente a la camiseta llamado Camiseta.java
otro correspondiente al Leggin llamado Leggin.java
otro correspondiente al almacén llamado VestiDeporTic.java (aquí va el main)
Recuerde eliminar la línea de package al hacer el envío y utilizar el botón de [+] para agregar más de un archivo de código fuente

##################################File Reto 3 

Integración de la clase FuncionesArticulos al Sistema de AseoTic

La fábrica de Implementos de Aseo para el hogar AseoTic necesita de su ayuda para crear una clase en Java llamada FuncionesArticulos que pueda integrar a su sistema.  Como la clase se va a integrar a un sistema, no debe pedir ningún dato del usuario, sólo va a tener funciones que hagan cosas específicas.   La clase FuncionesArticulos debe tener únicamente las siguientes cuatro funciones:

 

obtenerArticulos(ArrayList<String> lista):  Recibe como parámetro un ArrayList lista que contiene los nombres de los artículos fabricados.  La función debe generar una lista (ArrayList) de los artículos sin repetición, y la debe retornar. 
Ejemplo: Si la función recibe estos datos:

lista = ['ESCOBA', 'RECOGEDOR', 'TRAPEADOR', 'RECOGEDOR', 'CEPILLO', 'ESPONJILLA', 'TRAPEADOR']

La función debe retornar la siguiente lista:
['ESCOBA', 'RECOGEDOR', 'TRAPEADOR', 'CEPILLO', 'ESPONJILLA']

obtenerPosicionesArticulosFaltantes(ArrayList<Integer> lPos, ArrayList<String> tipos, String cat): Que recibe como parámetro 3 cosas: ArrayList<Integer> lPos, que contiene las posiciones de los artículos que faltan;  un ArrayList<String> tipos que contiene los nombres de los artículos faltantes, y un String cat que es el nombre de un artículo.  La función debe generar y retornar una lista (ArrayList) de posiciones de los artículos faltantes.
Ejemplo: 
Si la función recibe estos datos:

lPos = [0, 1, 4, 5, 6]
tipos = ['ESPONJILLA', 'RECOGEDOR', 'TRAPEADOR', 'RECOGEDOR', 'CEPILLO', 'ESPONJILLA', 'TRAPEADOR']
cat = ‘ESPONJILLA'

Se debe retornar la siguiente lista: [0, 5]
que es la coincidencia de la lista de posiciones dadas (lPos) con el dato que tiene cat  ('ESPONJILLA' en este ejemplo) en la lista de tipos recibida

obtenerFaltantes(ArrayList<String> lOtro, ArrayList<String> lAseoTic):  Para poder realizar un intercambio de artículos, esta función recibe una lista (ArrayList<String> ) de artículos que elabora otra fábrica llamada lOtro, y la lista (ArrayList<String> ) de repuestos que fabrica actualmente AseoTic llamada lAseoTic.  Se debe retornar una lista (ArrayList<String>) de artículos que me interesan del otro fabricante, es decir aquellos artículos que elabora el otro fabricante y no elabora AseoTic.

Ejemplo: si se tiene como entrada:

lOtro =['ESCOBA', 'CEPILLO', 'GUANTES', 'LIMPIA CRISTALES', 'BALDE', 'RECOGEDOR']
lAseoTic = ['TRAPEADOR', 'CEPILLO', 'RECOGEDOR', 'ESCOBA', 'ESPONJILLA']

La función debe retornar una lista que contiene: ['GUANTES', 'LIMPIA CRISTALES, 'BALDE']

obtenerArticulosIntercambiables(ArrayList<String> lOtro, ArrayList<String> lAseoTic): Esta función recibe dos listas lOtro (ArrayList<String>) y ArrayList<String> lAseoTic.  La función debe hallar la lista de artículos sobrantes de ambas listas ingresadas (lOtro y lAseoTic) y debe retornar el número (Integer) de artículos que se pueden intercambiar entre sí.

Ejemplo: si se tiene como entrada
lOtro =['GUANTES', 'ESCOBA', 'BALDE ESCURRIDOR DE TRAPEADOR', 'LIMPIA CRISTALES', 'BALDE', 'CEPILLO']
lAseoTic = ['ESPONJILLA', 'ESCOBA', 'CEPILLO', 'RECOGEDOR', 'ATOMIZADOR']

La función debe retornar: 3.  Al otro fabricante le interesan 3 artículos de AseoTic: ['ESPONJILLA',  'RECOGEDOR', 'ATOMIZADOR']. Y a AseoTic, le interesan 4 artículos del otro: =['GUANTES', 'BALDE ESCURRIDOR DE TRAPEADOR', 'LIMPIA CRISTALES', 'BALDE'] , entonces podrían intercambiar máximo 3 artículos. Para que sea evaluada correctamente por AseoTic, la función debe retornar un Integer.

 Entrada:

Este programa no requiere entrada. Ni generará salida. Se requiere que usted genere un archivo con el nombre FuncionesArticulos.java y que definan los nombres de las funciones dadas y sus parámetros tal cual está especificado en el enunciado.  La clase NO debe tener método main()


##############################File Reto 4

  La Droguería Tic decidió implementar su sistema para manejar las ventas de sus productos, La droguería desea comenzar a implementar el modelo de datos para la aplicación inicial que quiere hacer, y para ello lo ha contratado a usted. 

Para ello quiere implementar la Tabla productos, la cual tiene: un código (int), nombre, precio, marca, tipo (valor por defecto: alimento) y un campo para observaciones en el que coloca información adicional de los productos, por ejemplo: la concentración de un medicamento, o la presentación en la que viene un alimento.

También quiere almacenar la información de sus clientes.  Para ello le interesa almacenar el nombre, la dirección, el teléfono, el barrio y la identificación la cual será la forma de identificar de manera única a un cliente en la base de datos. 

Por último, se desea almacenar la información sobre los proveedores de los productos y la información de la factura. Los campos de identificación para el producto es un valor de tipo int, y cada factura se identifica de manera única con el id del producto, id del cliente y un código (int). Un ingeniero les desarrolló el siguiente modelo entidad relación, el cual usted debe implementar en MySql.


 

 

Usted debe hacer lo siguiente:

1.    Un Script SQL por cada una de las tablas que está planteado en el MER en el que debe estar el código para generar la tabla y los datos correspondientes a esa tabla.  Debe introducir los datos exactamente como se muestran a continuación: 

 

·  Para tabla Proveedor : (los datos de ciudad y dirección los pueden llenar con los valores que deseen)

Código

Nombre

3345

Bayer

3346

Genfar

3347

Tecnoquimicas

3348

Granero su grano

3349

Nacional de dulces

 

Para tabla Cliente: (los datos de dirección, teléfono y barrio, los deben llenar con los valores que deseen)

cedula

Nombre

12333451

Julia María Castro

1112876321

Bernardo Gutierrez Martinez

29876543

Juan Esteban Mora

33876458

Lina Milena Ocampo

22345765

Josefina Lopez Murillo

98765678

Samuel Siachoque Trochez

54322123

Carolina Aguado Velez

·        

 

 

 

 

 

 

 

 

·         Para tabla Producto: (el campo de marca le pueden colocar el dato deseado)

Código

Nombre

Precio

Tipo

prov

observaciones

2100

acetaminofén

12000

Medicamento

3345

Caja por 20 tabletas

2101

Arroz D&D

35000

Alimento

3348

Presentación por 25 libras

2102

Huevos mi gallina

18000

Alimento

3348

Panal por 30 unidades

2103

Bombones de chocolate

1500

Alimento

3349

unidad

2104

Vitamina c

23500

Medicamento

3345

Presentación efervescente

2105

Sorel loción

35600

Medicamento

3345

unidad

2106

Bicarbonato de sodio

4560

Medicamento

3347

Por 500 gr

2107

Algodón

3500

Medicamento

3346

paquete

2108

acetaminofén

13500

Medicamento

3346

Por 500 miligramos

2109

Vitamina c

22600

Medicamento

3347

Por 100 ui

2110

betametasona

18900

Medicamento

3347

Presentación por 20 gr

 

 

































·         Para tabla Factura 

Id_factura

Id_cliente

Id_producto

fecha

1000

2100

29876543

'2020-10-25 20:00:00' 

1004

2105

22345765

'2021-03-15 18:30:00'

1002

2100

29876543

'2021-03-17 15:30:20'

1005

2101

1112876321

'2021-05-20 11:30:00

1005

2102

1112876321

'2021-05-20 11:30:00

1002

2102

29876543

'2021-03-17 15:30:20'

1006

2106

33876458

'2021-06-22 21:30:00

1002

2105

29876543

'2021-03-17 15:30:20'

1003

2105

54322123

'2021-01-20 20:30:00

1007

2103

33876458

'2021-02-15 20:30:20'

1000

2104

29876543

'2020-10-25 20:00:00' 

1008

2103

1112876321

'2021-05-21 11:30:00

1008

2102

1112876321

'2021-05-21 11:30:00

1009

2110

98765678

'2021-07-21 11:30:00

1010

2108

98765678

'2021-06-21 11:30:00

1011

2109

12333451

'2021-06-21 09:30:00

1012

2110

98765678

'2021-06-22 12:20:00

1010

2105

98765678

'2021-06-21 11:30:00

 

2.    Haga un solo archivo (script) SQL para las siguientes modificaciones sobre los datos almacenados

·         Aumentar el precio de todos los alimentos en un 15%

·         Modificar la fecha de la factura 1002 por '2021-05-12 16:30:00’

·        Actualice el nombre de todos los productos que tienen en su observación la palabra unidad, colocando UN. al inicio del nombre.  Por Ejemplo si se tiene el siguiente producto: 


Huevos mi gallina

18000

Alimento

3348

Panal por 30 unidades




debería quedar:

UN. Huevos mi gallina 

18000

Alimento

3348

Panal por 30 unidades






3.   Haga un solo archivo (script) SQL para las siguientes consultas


1.    Liste los nombres de los productos distintos que terminen en N

2.    Listar los productos que se le compra a cada proveedor, para ello se debe mostrar solamente: los nombres de cada proveedor y los nombres de los productos

3.    muestre la cantidad de dinero que se tiene por concepto de las ventas

4.    Muestre por cada cliente que haya comprado algún medicamento, el nombre del cliente y la cantidad de medicamentos que ha comprado

 

NOTA: En el script sql para las consultas. Antes de cada consulta escribir SELECT 'Consulta #';  donde # es el número de la consulta.

Ejemplo:

Select 'Consulta 1';
Select nombre from ....;
Select 'Consulta 2';
Select .....;
Select 'Consulta 3';
Select .....;

ENTREGA

Para la entrega es necesario:

1.    Subir cada uno de los archivos .sql en orden de ejecución. Es decir, primero se suben las tablas que no tienen Referencias (Llaves foráneas) y luego las demás. 

 2.    Luego de subir los scripts de sql de creación e inserción de datos, se debe subir el de modificaciones y por último el de consultas.

 3.    Luego se evalúa, igual que con los retos anteriores. Si todo está correcto, tanto las inserciones, como las modificaciones y las consultas, se obtendrá una nota de 5/5. Si hay un error la evaluación será 0. Por lo que será necesario que revisen hasta que las salidas sean las correctas.
  
################ File

