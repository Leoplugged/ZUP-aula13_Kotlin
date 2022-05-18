package br.com.catalisa.kotlin.conceitosBasicos

fun main() {
    print("Quantos alunos tem na sua sala? ")
    var qtdAluno = readln().toInt()
    var cont = 0
    val notas = DoubleArray(qtdAluno)

    while(cont != qtdAluno){
        print("Qual a nota do aluno ${cont+1}?")
        val nota = readln().toDouble()
        notas[cont] = nota
        cont++
    }
    print("A média da turma é ${notas.average()}.")
}