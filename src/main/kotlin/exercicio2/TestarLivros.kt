package exercicio2


fun main() {
    println("\t\t---LIVRO FAVORITO---")
    val livroFavorito = Livros()

    livroFavorito.titulo = "O Pequeno Príncipe"
    livroFavorito.qtdPaginas = 98

    println("O livro ${livroFavorito.titulo} possui ${livroFavorito.qtdPaginas} páginas")

    livroFavorito.paginasLidas = 20
    livroFavorito.verificarProgresso()
    livroFavorito.paginasLidas = 50
    livroFavorito.verificarProgresso()

    println("--------------------------------------------")

    val listaDeLivros = ArrayList<Livros>()

    val livro1 = Livros()
    livro1.titulo = "Dom Quixote"
    livro1.qtdPaginas = 863
    livro1.paginasLidas = 102
    listaDeLivros.add(livro1)

    val livro2 = Livros()
    livro2.titulo = "Guerra e Paz"
    livro2.qtdPaginas = 1225
    livro2.paginasLidas = 230
    listaDeLivros.add(livro2)

    val livro3 = Livros()
    livro3.titulo = "Moby Dick"
    livro3.qtdPaginas = 635
    livro3.paginasLidas = 56
    listaDeLivros.add(livro3)

    val livro4 = Livros()
    livro4.titulo = "Cem Anos de Solidão"
    livro4.qtdPaginas = 417
    livro4.paginasLidas = 31
    listaDeLivros.add(livro4)

    val livro5 = Livros()
    livro5.titulo = "Ulisses"
    livro5.qtdPaginas = 730
    livro5.paginasLidas = 452
    listaDeLivros.add(livro5)

    val livro6 = Livros()
    livro6.titulo = "Crime e Castigo"
    livro6.qtdPaginas = 671
    livro6.paginasLidas = 12
    listaDeLivros.add(livro6)

    val livro7 = Livros()
    livro7.titulo = "A Montanha Mágica"
    livro7.qtdPaginas = 902
    livro7.paginasLidas = 23
    listaDeLivros.add(livro7)

    val livro8 = Livros()
    livro8.titulo = "Orgulho e Preconceito"
    livro8.qtdPaginas = 279
    livro8.paginasLidas = 201
    listaDeLivros.add(livro8)

    val livro9 = Livros()
    livro9.titulo = "1984"
    livro9.qtdPaginas = 328
    livro9.paginasLidas = 68
    listaDeLivros.add(livro9)

    val livro10 = Livros()
    livro10.titulo = "O Senhor dos Anéis"
    livro10.qtdPaginas = 458
    livro10.paginasLidas = 394
    listaDeLivros.add(livro10)


    println("\t\t---LISTA DE LIVROS---\n")
    for (livro in listaDeLivros){
        println("O livro ${livro.titulo} possui ${livro.qtdPaginas} páginas")
        livro.verificarProgresso()
        println("\n")
    }
}
