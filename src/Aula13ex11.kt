package br.com.catalisa.kotlin.conceitosBasicos

fun main() {
    val listaNum = DoubleArray(15)
    var cont = 0

    for (num in listaNum) {
        print("Digite o ${cont + 1}º número: ")
        val num = readln().toDouble()
        listaNum[cont] = num
        cont++
    }

    print("A média é: ${listaNum.average()}")
}