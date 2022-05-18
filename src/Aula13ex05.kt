package br.com.catalisa.kotlin.conceitosBasicos

//5. Faça um programa que receba de lista de compras sendo que a pessoa usuária irá inserir a quantidade de itens que quer adicionar na lista de compras e após inserir a quantidade o programa deverá permitir que o usuário insira os produtos nessa lista. Exiba a lista completa para o usuário.

fun main(){
    print("Digite a quantidade de itens que você deseja inserir na lista de compras: ")
    var qtdd = readln().toInt()

    val listaCompras = ArrayList<String>(qtdd)

    while (qtdd > 0) {
        println("Nome do item a ser adicionado na lista: ")
        val item = readln()
        listaCompras.add(item)
        qtdd--
    }

    println("Lista de itens adicionados: ")
    listaCompras.forEach { item -> println("> $item")
    }
}