package br.com.catalisa.kotlin.conceitosBasicos

fun main(){
    var cont = 0
    var soma = 0

    do {
        soma += cont
        cont++
        println("$cont")
    } while (cont < 15)
    println("$soma")
}