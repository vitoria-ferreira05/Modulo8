package exercicio2

fun main() {

    var opcao: Int?
    do {
        opcao = mostrarMenu()

        when (opcao) {
            1 -> {
                cadastrarLivroTerror()
            }

            2 -> {
              cadastrarLivroEpico()
            }

            3 -> {
             cadastrarLivroAutoAjuda()
            }

            4 -> {
                println("\t\t\t---LIVROS CADASTRADOS---\n")
                mostrarLivros()
            }

            5 -> println("Sistema encerrado!")
            else -> println("Digite uma opção válida")
        }
    } while (opcao != 5)
}

private fun mostrarLivros() {

    val livroTerror = Livro.Terror("O iluminado", "Stephen King")
    biblioteca.adicionarLivro(livroTerror)
    val livroEpico = Livro.Epico("Os lusíadas", "Luís de Camões")
    biblioteca.adicionarLivro(livroEpico)
    val livroAutoAjuda = Livro.AutoAjuda("O Poder do Agora", "Eckhart Tolle")
    biblioteca.adicionarLivro(livroAutoAjuda)

    for (livro in livros) {
        println(livro.toString())
    }
    println()
}