package com.example.unidad1

/*
1. ¿Puedes implementar la función displayAlertMessage() en este programa de modo que imprima el
 resultado que se muestra?


 2.


 */

fun main() {
    val operatingSystem1 = "Windows"
    val operatingSystem2 = "Mac OS"
    val emailId1 = "user_one@gmail.com."
    val emailId2 = "user_two@gmail.com."
    val emailId3 = "user_three@gmail.com."
    println(displayAlertMessage(email = emailId1))
    println(displayAlertMessage(operatingSystem1, emailId2))
    println(displayAlertMessage(operatingSystem2, emailId3))
}

fun displayAlertMessage(os: String = "Unknown OS", email: String): String {
    return "There's a new sign-in request on $os for your Google Account $email."
}