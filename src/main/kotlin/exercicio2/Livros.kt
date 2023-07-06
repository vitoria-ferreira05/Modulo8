package exercicio2

class Livros {
    var titulo: String = ""
    var qtdPaginas: Int = 0
    var paginasLidas: Int = 0

    fun verificarProgresso(){
        val porcentagem = (paginasLidas * 100) / qtdPaginas
        println("Você já leu $porcentagem% do livro")
    }
}
