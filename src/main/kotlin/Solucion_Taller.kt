
import java.time.LocalDateTime

/*
----------------------------------------------------------------------------------------------------------------
                            Actividad 1. Traduccion de ecuaciones
----------------------------------------------------------------------------------------------------------------
 */

// Punto a
// var s = Math.sqrt(Math.pow(X-m, 2.0)/(n-1))

// Punto b
// var P = -(Math.pow(y, 3.0) - 1)/((y+1)-Math.sqrt(y + 1))

// Punto c
// var Z = x * Math.pow(Math.pow(x, 2.0) + 1, 3.0) / (Math.sqrt(2 * x) + 1)

// Punto d
// var T = 1 - (Math.pow(x - 2, 1 / n) / Math.pow(x, 3.0))

// Punto e
// var s = (x != y) && (x <= y)

// Punto f
// var s = (a >= b * c) || (b <= c)

/*
----------------------------------------------------------------------------------------------------------------
                            Actividad 2. Evaluacion de expresione aritmeticas
----------------------------------------------------------------------------------------------------------------
 */

//  Punto a
/*
    30 + 8 * 3 / 6 - 4 % 6
    30 + 24 / 6 - 4 % 6
    30 + 4 - 4 % 6
    30 + 4 - 4
    30
 */

//  Punto b
/*
    30.0 / 20.0 - 2.5 * 3.0
    1.5 - 2.5 * 3.0
    1.5 - 7.5
    -6.0
 */

//  Punto c
/*
    8 / 4 / 2 * 6
    2 / 2 * 6
    1 * 6
    6
 */

/*
----------------------------------------------------------------------------------------------------------------
                            Actividad 3. Modelaje de problemas
----------------------------------------------------------------------------------------------------------------
 */

/*

Punto a. Realice una función que halle el área de un triángulo.

Entradas:
    base --> Double --> b
    altura --> Double --> a

Salidas:
    area --> Double --> area

 */
fun area_triangulo(b: Double, a: Double): Double {
    val area = b * a / 2
    return area
}

/*

Punto b. Si alquilar una bicicleta tiene cierto valor y puede transportar dos personas, determine cuántas bicicletas
necesito y cuánto dinero voy a gastar en alquilarlas, para transportar a todos los estudiantes de la universidad.

Entradas:
    costo_alquiler_bicicleta --> Double --> cab
    numero_estudiantes --> Int --> ne

Salidas:
    num_bicicletas --> Int --> bicicletas
    costo_alquiler --> Double --> costo

 */
fun costo_alquiler_bicicletas(cab: Double, ne: Int): Pair <Int, Double> {
    val bicicletas = ne / 2 + ne % 2
    val costo = bicicletas * cab
    return Pair(bicicletas, costo)
}

/*

Punto c. Según el DANE, el número de desempleados corresponde al 8.15% de la población activa. Escriba una función que
permita determinar cuántas personas desempleadas hay actualmente en Colombia.

Entradas:
    poblacion_activa --> Int --> pa

Salidas:
    desempleados --> Int --> desempleados

 */
fun calculo_desempleados(pa: Int) : Int {
    val desempleados = (pa * 0.0815).toInt()
    return desempleados
}

/*

Punto d. Se desea determinar cuántos dólares se puede adquirir con cierta cantidad de pesos colombianos.

Entradas:
    peso_colombiano --> Double --> pc
    trm --> Double --> trm

Salidas:
    dollar --> Double --> d

 */
fun conversion(pc: Double, trm: Double) : Double {
    val dollar = pc / trm
    return dollar
}

/*

Punto e. Una empresa que contrata personal requiere determinar la edad de las personas que solicitan trabajo, pero cuando
se les realiza la entrevista sólo se les pregunta el año en que nacieron. Realice el algoritmo para solucionar este problema.

Entradas:
    año_nacimiento --> Int --> an

Salidas:
    edad --> Int --> edad

 */
fun calculo_edad(an: Int) : Int {
    val edad = LocalDateTime.now().year - an
    return edad
}

/*

Punto f. Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo utilizan. Considere que
el cobro es con base en las horas que lo disponen y que las fracciones de hora se toman como completas yrealice una
función que permita determinar el cobro.

Entradas:
    tiempo --> Double --> t
    costo_hora --> Double --> ch

Salidas:
    cobro --> Double --> cobro

 */
fun cobro_estacionamiento(t: Double, ch: Double) : Double {
    val cobro = Math.ceil(t) * ch
    return cobro
}

/*

Punto g. Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura. Considere que se cobra
por m2 y realice una funciòn que le permita saber cuánto cobrar a un cliente.

Entradas:
    area --> Double --> a
    costo_m2 --> Double --> cm2

Salidas:
    costo --> Double --> costo

 */
fun costo_pintura(a: Double, cm2: Double) : Double {
    val costo = a * cm2
    return costo
}

/*

Punto h. Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en bicicleta, considerando
que lleva una velocidad constante. Realice una función para tal fin.

Entradas:
    velocidad --> Double --> v
    distancia --> Double --> d

Salidas:
    tiempo --> Double --> t

 */
fun tiempo_del_recorrido(v: Double, d: Double) : Double {
    val t = d / v
    return t
}

/*

Punto i. Realice un algoritmo para determinar cuánto pagará finalmente una persona por un artículo equis, considerando que
tiene un descuento de 5%, y debe pagar 19% de IVA (debe retornar el precio con descuento y el precio final).

Entradas:
    precio_articulo --> Double --> pa

Salidas:
    precio_descuento --> Double --> pf
    precio_final --> Double --> pd

 */
fun precio_articulo(pa: Double): Pair<Double, Double> {
    var pd = 0.95 * pa
    val pf = 1.19 * pd
    return Pair(pd, pf)
}

/*

Punto j. Realice una función para determinar la nota final que obtendrá un alumno considerando que realiza tres exámenes,
de los cuales el primero y el segundo tienen una ponderación de 25%, mientras que el tercero de 50%.

Entradas:
    nota_examen1 --> Double --> e1
    nota_examen2 --> Double --> e2
    nota_examen3 --> Double --> e3

Salidas:
    nota_final --> Double --> nf

 */
fun calculo_nota_final(e1: Double, e2: Double, e3: Double) : Double {
    val nf = 0.25 * e1 + 0.25 * e2 + 0.5 * e3
    return nf
}

/*

Punto k. Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la persona de menor edad.

Entradas:
    persona1 --> Object --> p1
    persona2 --> Object --> p2
    persona3 --> Object --> p2

Salidas:
    nombre_persona_menor_edad --> Strig --> npme
    edad_persona_menor_edad --> Int --> epme

 */
class Persona(val nombre: String, val edad: Int)
fun persona_menor_edad(p1: Persona, p2: Persona, p3: Persona): Pair<String, Int> {
    var pme: Persona
    pme = p1
    if (pme.edad > p2.edad) {
        pme = p2
    }
    if (pme.edad > p3.edad){
        pme = p3
    }
    val npme = pme.nombre
    val epme = pme.edad
    return Pair(npme, epme)
}

/*

Punto l. El presidente de la república ha decidido estimular a todos los estudiantes de una universidad mediante la
asignación de becas mensuales, para esto se tomarán en consideración los siguientes criterios: Para alumnos mayores de
18 años con promedio mayor o igual a 90, la beca será de $2000.00; con promedio mayor o igual a 75, de$1000.00; para los
promedios menores de 75 pero mayores o iguales a 60, de $500.00; a los demás se les enviará una carta de invitación
incitándolos a que estudien más en el próximo ciclo escolar. A los alumnos de 18 años o menores de esta edad, con promedios
mayores o iguales a 90, se les dará $3000; con promedios menores a 90 pero mayores o iguales a 80, $2000; para los alumnos
con promedios menores a 80 pero mayores o iguales a 60, se les dará $100, y a los alumnos que tengan promedios menores a 60
se les enviará carta de invitación. Realice la función correspondiente.

Entradas:
    edad --> Int --> e
    promedio --> Double --> p

Salidas:
    valor_beca --> Double --> beca
    enviar_carta --> Boolean --> carta

 */
fun asignacion_beca(e: Int, p: Double): Pair<Double, Boolean> {

    var beca = 0.0
    var carta = false

    if (e > 18) {
        if (p >= 90.0) {
            beca = 2000.0
        }
        else if (p >= 75.0) {
            beca = 1000.0
        }
        else if (p >= 60.0) {
            beca = 500.0
        }
        else {
            carta = true
        }
    }
    else {
        if (p >= 90.0) {
            beca = 3000.0
        }
        else if (p >= 80.0) {
            beca = 2000.0
        }
        else if (p >= 60.0) {
            beca = 100.0
        }
        else {
            carta = true
        }
    }

    return Pair(beca, carta)
}

/*

Punto m. Escriba una función que halle el volumen de un cono.

Entradas:
    radio --> Double --> r
    altura --> Double --> a

Salidas:
    volumen --> Double --> volumen

 */
fun volumen_cono(r: Double, a: Double): Double {
    val volumen = a * Math.PI * Math.pow(r, 2.0) / 3
    return volumen
}

/*

Punto n. En la universidad vamos a conectar los diversos computadores que hay en una sala de cómputo con cables. Se necesita
un cable para conectar dos computadores, y debe haber conexión entre todos los computadores. Escriba una función que determine
el número de cables a comprar a partir del número de computadores que hay en la sala.

Entradas:
    numero_computadores --> Int --> nc

Salidas:
    cantidad_cables --> Int --> cables

 */
fun calculo_cables(nc: Int) : Int {
    val cables = nc - 1
    return cables
}

/*

Punto o. Se sabe que una batería de celular contamina 175 litros de agua. ¿Cuántos litros de agua serán contaminados por
la población de una ciudad en un año si cada persona utiliza 2 baterías al semestre?

Entradas:
    pobacion --> Int --> p

Salidas:
    agua_contaminada --> Double --> ac

 */
fun calculo_agua_contaminada(p: Int) : Double {
    val baterias = p * 2 * 2
    val ac = baterias * 175.0
    return ac
}

/*

Punto p. Mi proveedor de Internet me asegura que mi conexión es de 4 megabytes por segundo. Escriba una función que permita
determinar cuántos minutos y segundos debo esperar para descargar la última película de La Mujer Maravilla.

Entradas:
    tamano_pelicula --> Double --> t (MB)

Salidas:
    tiempo_descarga_minutos --> Int --> tdm
    tiempo_descarga_seguncdos --> Int --> tds

 */
fun tiempo_descarga(t: Double) : Pair<Int, Int> {
    val tiempo = t / 4.0
    val tdm = tiempo / 60
    val tds = tiempo % 60
    return Pair(tdm.toInt(), tds.toInt())
}

/*

Punto q. El valor presente de un cierto capital de dinero a una tasa de interés t durante n años se encuentra a partir de la fórmula:
    VP = C / (1 + t)^n
Escriba una función que determine el valor presente a partir de los datos de entrada dados.

Entradas:
    capital --> Double --> c
    tiempo --> Double --> t
    tasa_interes --> Double --> ti

Salidas:
    valor_presente --> Double --> vp

 */
fun valor_presente(c: Double, t: Double, ti: Double) : Double {
    val vp = c / Math.pow(1 + ti, t)
    return vp
}