import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Test_Solucion_Taller {

    @Test
    fun area_triangulo() {
        assertEquals(2.0, area_triangulo(2.0, 2.0)
        )
    }

    @Test
    fun costo_alquiler_bicicletas() {
        var datos = costo_alquiler_bicicletas(1000.0, 7)
        var bicicletas = datos.first
        var costo = datos.second
        assertEquals(4, bicicletas)
        assertEquals(4000.0 , costo)
    }

    @Test
    fun calculo_desempleados() {
        assertEquals(3260000, calculo_desempleados(40000000))
    }

    @Test
    fun conversion() {
        assertEquals(5.0, conversion(19000.0, 3800.0))
    }

    @Test
    fun calculo_edad() {
        assertEquals(10, calculo_edad(2012))
    }

    @Test
    fun cobro_estacionamiento() {
        assertEquals(5000.0, cobro_estacionamiento(4.1, 1000.0))
    }

    @Test
    fun costo_pintura() {
        assertEquals(5500.0, costo_pintura(5.5, 1000.0))
    }

    @Test
    fun tiempo_del_recorrido() {
        assertEquals(1.5, tiempo_del_recorrido(60.0, 90.0))
    }

    @Test
    fun precio_articulo() {
        var datos = precio_articulo(10000.0)
        var precio_descuento = datos.first
        var precio_final = datos.second
        assertEquals(9500.0, precio_descuento)
        assertEquals(11305.0 , precio_final)
    }

    @Test
    fun calculo_nota_final() {
        assertEquals(3.0, calculo_nota_final(4.0, 3.0, 2.5))
    }

    @Test
    fun persona_menor_edad() {
        var datos = persona_menor_edad(Persona("Pedro",45), Persona("Jeny", 8), Persona("Felipe", 18))
        var nombre = datos.first
        var edad = datos.second
        assertEquals("Jeny", nombre)
        assertEquals(8 , edad)
    }

    @Test
    fun asignacion_beca() {
        var datos = asignacion_beca(16, 80.2)
        var beca = datos.first
        var carta = datos.second
        assertEquals(2000.0, beca)
        assertEquals(false , carta)
    }

    @Test
    fun volumen_cono() {
        assertEquals(5235.987755982988, volumen_cono(10.0, 50.0)
        )
    }

    @Test
    fun calculo_cables() {
        assertEquals(4, calculo_cables(5)
        )
    }

    @Test
    fun calculo_agua_contaminada() {
        assertEquals(7000000.0, calculo_agua_contaminada(10000)
        )
    }

    @Test
    fun tiempo_descarga() {
        var datos = tiempo_descarga(2392.1)
        var minutos = datos.first
        var segundos = datos.second
        assertEquals(9, minutos)
        assertEquals(58 , segundos)
    }

    @Test
    fun valor_presente() {
        assertEquals(8638.37598531476, valor_presente(10000.0, 3.0, 0.05))
    }

}