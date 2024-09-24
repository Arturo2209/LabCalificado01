package com.bullon.carlos.laboratoriocalificado01

import org.junit.Test
import org.junit.Assert.*

class Ejercicio01KotlinTest {

    @Test
    fun testSonAnagramas() {
        // Instancia de la clase que contiene la lógica de anagramas
        val ejercicio = Ejercicio01Kotlin()

        // Primera prueba: "listen" y "silent" son anagramas, debe retornar true
        val resultado1 = ejercicio.sonAnagramas("listen", "silent")
        println("Prueba 1 (\"listen\", \"silent\"): $resultado1")
        assertTrue(resultado1)

        // Debe retornar false ya que tienen diferentes letras
        val resultado2 = ejercicio.sonAnagramas("hello", "world")
        println("Prueba 2 (\"hello\", \"world\"): $resultado2")
        assertFalse(resultado2)

        // Debe retornar true porque tienen las mismas letras
        val resultado3 = ejercicio.sonAnagramas("anagram", "nagaram")
        println("Prueba 3 (\"anagram\", \"nagaram\"): $resultado3")
        assertTrue(resultado3)

        // Debe retornar false porque tienen diferentes letras
        val resultado4 = ejercicio.sonAnagramas("rat", "car")
        println("Prueba 4 (\"rat\", \"car\"): $resultado4")
        assertFalse(resultado4)

        // Prueba en la que debe salir false porque tienen diferentes letras
        val resultado5 = ejercicio.sonAnagramas("art", "tar")
        println("Prueba 5 (\"art\", \"tar\"): $resultado5")
        assertTrue(resultado5)
    }
}
