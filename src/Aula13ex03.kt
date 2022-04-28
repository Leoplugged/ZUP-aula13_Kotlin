package br.com.catalisa.kotlin.conceitosBasicos

//3. Escreva um algoritmo que exiba 20 vezes a mensagem “Eu gosto de estudar Algoritmos!”. Utilize o comando de repetição Enquanto (While)
fun main(){
    exibirMensagem()
}

fun exibirMensagem(){
    var i = 0
    while(i <= 20){
        println("Eu gosto de estudar Algoritmos.")
        i ++
    }
}