package br.com.catalisa.kotlin.conceitosBasicos

fun main(){
    var controlador = 1
    val listaMusicas = ArrayList<String>(3)

    print("Digite o nome da banda musical: ")
    val bandaMusical = readln()

    while (controlador < 4) {
        print("Digite a ${controlador}ª música de $bandaMusical: ")
        val musica = readln()
        listaMusicas.add(musica)
        controlador++
    }

    println("Seguem músicas da banda $bandaMusical: ")
    listaMusicas.forEach {musica -> println(musica)}
}