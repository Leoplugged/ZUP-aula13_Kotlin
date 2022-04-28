package br.com.catalisa.kotlin.conceitosBasicos

//4. Faça um programa que receba 10 números inteiros informados pela pessoa usuária, armazene-os e verifique quais números são pares, e exiba para o usuário apenas os números pares da lista.

fun main(){
    println("Digite 10 números inteiros para conhecer quais deles são pares: ")

    var numerosDigitados = IntArray(10)

    for (i: Int in numerosDigitados.indices){
        print("Digite o ${i+1}º número: ")
        numerosDigitados[i] = readln().toInt()
    }
    exibirPares(numerosDigitados)
}

fun exibirPares(numerosDigitados: IntArray){
    print("Dos números que foram digitados,")
    for(i in numerosDigitados.indices) {
        if (numerosDigitados[i] % 2 == 0){
            print(" ${numerosDigitados[i]},")
        }
    }
    print(" são pares.")
}
