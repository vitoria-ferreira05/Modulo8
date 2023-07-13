package exercicio5

open class Animal(var nome: String, var raca: String, var nomeResponsavel: String) {
    open fun movimentar() {}
    open fun comer() {}
    open fun dormir() {}
    open fun mostrarInformacoes() {}
}


class Cachorro(nome: String, raca: String, nomeResponsavel: String) : Animal(nome, raca, nomeResponsavel) {
    override fun mostrarInformacoes() {
        println("nome: $nome, raça: $raca, nome do responsavel: $nomeResponsavel")
    }

    override fun movimentar() {
        println("Andando em 4 patas")
    }

    override fun comer() {
        println("Comendo bife")
    }

    override fun dormir() {
        println("Dormindo na cama da Jéssica\n")
    }
}

class Gato(nome: String, raca: String, nomeResponsavel: String) : Animal(nome, raca, nomeResponsavel) {
    override fun mostrarInformacoes() {
        println("nome: $nome, raça: $raca, nome do responsavel: $nomeResponsavel")
    }

    override fun movimentar() {
        println("Andando e saltando em 4 patas")
    }

    override fun comer() {
        println("“Comendo whiskas sachê")
    }

    override fun dormir() {
        println("Dormindo na caixa\n")
    }
}

class Peixe(nome: String, raca: String, nomeResponsavel: String) : Animal(nome, raca, nomeResponsavel) {
    override fun mostrarInformacoes() {
        println("nome: $nome, raça: $raca, nome do responsavel: $nomeResponsavel")
    }

    override fun movimentar() {
        println("Nadando")
    }

    override fun comer() {
        println("Comendo ração molhada")
    }

    override fun dormir() {
        println("Dormindo de olho aberto\n")
    }
}
