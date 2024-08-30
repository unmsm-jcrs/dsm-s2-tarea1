package com.example.unidad1

//¿Puedes cambiar el nombre de las funciones, de los parámetros de las funciones y de las variables
//utilizados en este programa según las prácticas recomendadas?

fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}