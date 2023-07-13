package exercicio2

open class Livro(private var genero: String, private var nomeLivro: String, private var nomeAutor: String) {
    override fun toString(): String {
        return "(genero='$genero', livro='$nomeLivro', autor='$nomeAutor')"
    }
    class Terror(nomeLivro: String, nomeAutor: String) : Livro("Terror", nomeLivro, nomeAutor)
    class Epico(nomeLivro: String, nomeAutor: String) : Livro("Epico", nomeLivro, nomeAutor)
    class AutoAjuda(nomeLivro: String, nomeAutor: String) : Livro("Autoajuda", nomeLivro, nomeAutor)

}

