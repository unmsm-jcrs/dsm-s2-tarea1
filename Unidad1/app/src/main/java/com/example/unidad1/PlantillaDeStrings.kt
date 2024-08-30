package com.example.unidad1

//1. ¿Puedes determinar la causa raíz de esos errores y corregirlos?
//Se esta usando 'val' en vez de 'var'
//Otra alternativa para que funcione seria quitar la asignación de las variables
fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

//2. ¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
// Seria: Sale - Up to 20% discount on Google Chromecast! Hurry up!