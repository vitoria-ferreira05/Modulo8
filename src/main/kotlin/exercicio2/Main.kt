package exercicio2

fun main() {
    val diaAtual = 11
    val mesAtual = 7
    val anoAtual = 2023

    val pessoa1 = Pessoa("Albert Einstein", 14, 3, 1879)
    pessoa1.calculaIdade(diaAtual, mesAtual, anoAtual)
    println("A dade de ${pessoa1.informarNome()} é: ${pessoa1.informarIdade()} anos")


    val pessoa2 = Pessoa("Isaac Newton", 4, 1, 1643)
    pessoa2.calculaIdade(diaAtual, mesAtual, anoAtual)
    println("A idade de ${pessoa2.informarNome()} é: ${pessoa2.informarIdade()} anos")


}
