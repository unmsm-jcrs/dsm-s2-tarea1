package com.example.unidad1

fun main() {
    imprimirTemperaturaPorCiudad("Ankara", 27, 31, 82)
    imprimirTemperaturaPorCiudad("Tokyo", 32, 36, 10)
    imprimirTemperaturaPorCiudad("Cape Town", 59, 64, 2)
    imprimirTemperaturaPorCiudad("Guatemala City", 50, 55, 7)
}

fun imprimirTemperaturaPorCiudad(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}