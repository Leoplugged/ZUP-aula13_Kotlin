package br.com.catalisa.kotlin.conceitosBasicos

fun main() {
    print("Digite o ano em que você nasceu: ")
    var ano = readln().toInt()
    var idade = 0

    while (ano <= 2021) {
        println("Em $ano, a pessoa tinha $idade.")
        ano++
        idade++
    }
    println("E neste ano, a pessoa tem ${idade}.")
}