package exercicio6

fun main() {
    val guardaVolumes = GuardaVolumes()

    val peca1 = object : Peca("Marca1", "Modelo1") {
        override fun retirada() {
            println("Peça 1 foi retirada.")
        }
    }

    val peca2 = object : Peca("Marca2", "Modelo2") {
        override fun retirada() {
            println("Peça 2 foi retirada.")
        }
    }

    val numeroIdentificacao = guardaVolumes.guardarPecas(arrayListOf(peca1, peca2))

    println("As peças foram guardadas com o número de identificação: $numeroIdentificacao")
    println("Peças no guarda-volumes:")
    guardaVolumes.mostrarPecas()

    println("Retirando as peças associadas ao número de identificação $numeroIdentificacao")
    guardaVolumes.devolverPecas(numeroIdentificacao)
    println("Peças no guarda-volumes após a retirada:")
    guardaVolumes.mostrarPecas()

    println("Tentando acessar peças associadas ao número de identificação $numeroIdentificacao após a retirada")
    guardaVolumes.mostrarPecas(numeroIdentificacao)
}
