package exercicio2

class NomeAlimento(private val nomeDoAlimento: String, private val qtdade: Double) {

    fun getNomeDoAlimento(): String {
        return nomeDoAlimento
    }

    fun getQtdade(): Double {
        return qtdade
    }
}
