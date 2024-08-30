package com.example.unidad1

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "${baseSalary + bonusAmount}"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

/*
1. ¿Puedes determinar el resultado de este código antes de ejecutarlo en Kotlin Playground?
-El resultado sería: Congratulations for your bonus! You will receive a total of 5000 + 1000 (additional bonus).
-Esto es debido a que se utiliza comillas en la variable totalSalary

2. Cuando ejecutas el código en Kotlin Playground, ¿se imprime el resultado que esperabas?
-No, una forma de que salga es con:     val totalSalary = "${baseSalary + bonusAmount}" o $baseSalary + $bonusAmount
 */