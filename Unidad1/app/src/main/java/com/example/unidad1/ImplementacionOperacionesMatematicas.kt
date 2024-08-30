package com.example.unidad1

/*
1. ¿Puedes corregir el error de modo que el programa imprima este resultado? >10 + 5 = 15


2. ¿Puedes definir la función add() de modo que el programa imprima este resultado?


3. ¿Puedes implementar la función subtract() de la misma manera en que implementaste la función add()?
 Modifica la función main() también para usar la función subtract(), de modo que puedas verificar
  que funcione como se espera.

 */


/*1.
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}
 */
/*2.
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

fun add(dato1: Int, dato2: Int):Int {
    return dato1 + dato2
}
*/

//3.
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = subtract(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)
    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun subtract(dato1: Int, dato2: Int):Int {
    return dato1 - dato2
}



