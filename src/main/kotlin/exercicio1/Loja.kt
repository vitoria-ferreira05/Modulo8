package exercicio1

fun main(){
    val listaProdutos = arrayListOf<Produtos>()

    val livro1 = Produtos.Livros("Stephen King", "It - A Coisa", 67.50, 789123456)
    listaProdutos.add(livro1)
    val livro2 = Produtos.Livros("Stephen King", "O Iluminado", 42.00, 987654321)
    listaProdutos.add(livro2)
    val cd1 = Produtos.CDs(1, "DUA LIPA - FUTURE NOSTALGIA", 44.64, 456789123)
    listaProdutos.add(cd1)
    val cd2 = Produtos.CDs(1, "Chromatica", 57.90, 567891234)
    listaProdutos.add(cd2)
    val dvd1 = Produtos.DVDs(125, "Adão Negro DVD", 44.90, 123456789)
    listaProdutos.add(dvd1)

    for (produto in listaProdutos){
        produto.mostrarDetalhesDoltem()
        println()
    }

    buscarProduto(listaProdutos, cd1)
    buscarProduto(listaProdutos, Produtos.DVDs(125, "Adão Negro DVD", 44.90, 123456789))
}

fun buscarProduto(produtos: ArrayList<Produtos>, produtoBuscado: Produtos) {
    for ((i, produto) in produtos.withIndex()) {
        if (produto == produtoBuscado) {
            println("O produto ${produtoBuscado.nome} foi encontrado na posição $i")
            return
        }
    }
    println("O produto ${produtoBuscado.nome} não foi encontrado.")
}

