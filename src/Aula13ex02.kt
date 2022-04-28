package br.com.catalisa.kotlin.conceitosBasicos

//2. Escreva um algoritmo que leia um número inteiro (de 1 a 7) representando o dia da semana e informe o nome do dia correspondente.
fun main(){
    diaSemana()
}

fun diaSemana() {
    val diasSemana = arrayOf("Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo")
    print("Digite um número entre 1 a 7 para ver o nome do dia da semana correspondente: ")
    val numero = readln().toInt()
    println("$numero é correspondente a ${diasSemana[numero]}.")
}
