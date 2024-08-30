package com.example.unidad1

// Implementarás una función que compara la cantidad de minutos que usaste el teléfono hoy y ayer.
// La función acepta dos parámetros de números enteros y muestra un valor booleano.

fun main() {
    generarTexto(300, 250)
    generarTexto(300, 300)
    generarTexto(200, 220)
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

fun generarTexto(timeSpentToday: Int, timeSpentYesterday: Int) {
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
}