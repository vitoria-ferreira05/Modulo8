package exercicio1

abstract class Produtos(val codigoDeBarras: Int) {
    abstract var nome: String
    abstract var preco: Double
    abstract fun mostrarDetalhesDoltem()
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Produtos

        return codigoDeBarras == other.codigoDeBarras
    }

    override fun hashCode(): Int {
        return codigoDeBarras
    }


    class Livros(private val autor: String, override var nome: String, override var preco: Double, codigoDeBarras: Int) : Produtos(
        codigoDeBarras
    ) {
        override fun mostrarDetalhesDoltem() {
            println("Livros(nome='$nome', preco=$preco, autor='$autor')")
        }
    }

    class CDs(private val numeroFaixas: Int, override var nome: String, override var preco: Double, codigoDeBarras: Int) : Produtos(
        codigoDeBarras
    ) {
        override fun mostrarDetalhesDoltem() {
            println("CD's(nome='$nome', preco=$preco, numero de faixas='$numeroFaixas')")
        }
    }

    class DVDs(private val duracao: Int, override var nome: String, override var preco: Double, codigoDeBarras: Int) : Produtos(
        codigoDeBarras
    ) {
        override fun mostrarDetalhesDoltem() {
            println("DVD's(nome='$nome', preco=$preco, numero de faixas='$duracao')")
        }
    }
}
