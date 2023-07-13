package exercicio2

val biblioteca = Biblioteca()
val livros = mutableListOf<Livro>()

class Biblioteca {
    fun adicionarLivro(livro: Livro) {
        livros.add(livro)
    }
}

fun mostrarMenu(): Int? {
    println(
        "\n\t\t\t---MENU BIBLIOTECA---\n" +
                "\nDeseja registrar livros de qual gênero?:" +
                "\n1. Terror" +
                "\n2. Epico" +
                "\n3. AutoAjuda" +
                "\n4. Mostrar livros cadastrados" +
                "\n5. Sair"
    )
    return readln().toIntOrNull()
}


fun cadastrarLivroTerror() {
    print(
        "\t\tOlá bibliotecário(a), bem vindo(a)!\n" +
                "\nQuantos livros de Terror deseja registrar?: "
    )
    val quantLivros = readln().toIntOrNull()

    for (i in 1..quantLivros!!) {
        print("Digite o nome do livro de Terror $i: ")
        val nomeLivro = readln()
        print("Digite o nome do autor(a) do livro $nomeLivro: ")
        val nomeAutor = readln()
        val livroTerror = Livro.Terror(nomeLivro, nomeAutor)
        biblioteca.adicionarLivro(livroTerror)
        println("Livro(s) $livroTerror cadastrado(s) com sucesso!")
    }
}

fun cadastrarLivroEpico() {
    print(
        "\t\t\tOlá bibliotecário(a), bem vindo(a)!" +
                "\n\t\tQuantos livros Epico deseja registrar? "
    )
    val quantLivros = readln().toIntOrNull()

    for (i in 1..quantLivros!!) {
        print("Digite o nome do livro Epico: ")
        val nomeLivro = readln()
        print("Digite o nome do autor(a) do livro $nomeLivro: ")
        val nomeAutor = readln()
        val livroEpico = Livro.Epico(nomeLivro, nomeAutor)
        biblioteca.adicionarLivro(livroEpico)
        println("Livro(s) $livroEpico cadastrado(s) com sucesso!")
    }
}

fun cadastrarLivroAutoAjuda() {
    print(
        "\t\t\tOlá bibliotecário(a), bem vindo(a)!" +
                "\n\t\tQuantos livros de AutoAjuda deseja registrar? "
    )
    val quantLivros = readln().toIntOrNull()

    for (i in 1..quantLivros!!) {
        print("Digite o nome do livro de Autoajuda: ")
        val nomeLivro = readln()
        print("Digite o nome do autor(a) do livro $nomeLivro")
        val nomeAutor = readln()
        val livroAutoAjuda = Livro.AutoAjuda(nomeLivro, nomeAutor)
        biblioteca.adicionarLivro(livroAutoAjuda)
        println("Livro(s) $livroAutoAjuda cadastrado(s) com sucesso!")
    }
}



