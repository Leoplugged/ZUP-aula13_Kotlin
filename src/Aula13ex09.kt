package br.com.catalisa.kotlin.conceitosBasicos

fun main() {
    println("Informe 2 números de cada vez: ")
    val num1 = readln().toDouble()
    val num2 = readln().toDouble()

    println("Qual operação deseja realizar?\n1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir")
    val selecao = readln().toInt()

    when (selecao) {
        1 -> println("A soma é: ${num1+num2}.")
        2 -> println("A subtração é: ${num1-num2}.")
        3 -> println("A multiplicação é: ${num1*num2}.")
        4 -> {
            if (num2 == 0.0)
                print("Para divisão o segundo número não pode ser igual a 0")
            else
                println("A divisão é: ${num1/num2}")
        }
        else -> print("Opção inválida")
    }
}