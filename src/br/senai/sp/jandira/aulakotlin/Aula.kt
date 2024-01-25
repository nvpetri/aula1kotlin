package br.senai.sp.jandira.aulakotlin

fun main() {
    println("Olá mundo")

    var preco: Double
    var cidade: String

    print("Qual a sua idade? ")
    var idade = readln().toInt()

    print("Qual seu nome? ")
    var nome = readln()

    print("Você mora aonde?")
    cidade = readln()

    print("Quanto é a passagem do seu onibus?")
    preco = readln().toDouble()

    print("Quantas vezes você deseja repetir a frase?")
    var iFinal = readln().toInt()

    var sitIdade = if (idade >= 18) "maior" else "menor"

    var i = 0

    while (i < iFinal) {
        println("Meu nome é $nome e tenho $idade anos, sou $sitIdade de idade. A passagem de $cidade é R$$preco")
    i ++
    }

    for (i in 1 .. iFinal){
        println("$i - Meu nome é $nome e tenho $idade anos, sou $sitIdade de idade. A passagem de $cidade é R$$preco")
    }
    
}