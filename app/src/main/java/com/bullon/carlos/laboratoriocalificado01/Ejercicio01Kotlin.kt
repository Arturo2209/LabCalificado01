package com.bullon.carlos.laboratoriocalificado01

class Ejercicio01Kotlin {

    // Función que verifica si dos palabras son anagramas
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Esta condicional verifica que si no tienen la misma logintud no son anagramas
        if (palabra1.length != palabra2.length) {
            return false
        }

        // Converti ambas palabras en arrays de caracteres, ordenarlos y compararlos
        return palabra1.toCharArray().sorted() == palabra2.toCharArray().sorted()
    }
}
