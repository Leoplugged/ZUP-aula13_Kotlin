package br.com.catalisa.kotlin.conceitosBasicos

fun main(){
    print("Digite um termo para verificar o Fibonacci: ")
    val x = readln().toInt()
    var num1 = 0
    var num2 = 1

    for (i in 0..x) {
        num2 += num1
        num1 = num2 - num1
        println("$num2")
    }

    println("\nO valor do ${x}º termo é $num2.")
}