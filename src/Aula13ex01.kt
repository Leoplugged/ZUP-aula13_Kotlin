package br.com.catalisa.kotlin.conceitosBasicos

//1. Faça um programa que leia 5 valores inteiros, armazene-os em um vetor, calcule e apresente a soma destes valores.
fun main(){
    somatoria()
}

fun somatoria(){
    println("Para fazer a soma, digite 5 valores de cada vez: ")
    val valorDigitado = IntArray(5)
    var soma = 0
    for (i in 0..4) {
        valorDigitado[i] = readln().toInt()
        soma += valorDigitado[i]
    }
    println("A Soma dos valores é $soma.")
}