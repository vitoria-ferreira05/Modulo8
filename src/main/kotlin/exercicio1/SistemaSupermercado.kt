package exercicio1

import java.time.LocalDate

fun main() {
    var opcao: Int?
    do {
        opcao = menuCliente()
    } while (opcao != 3)
}


val produto = Produto(nome = "", codBarras = "", LocalDate.now())
val listaProduto = mutableListOf<Produto>()
fun cadastrarProdutos(produto: Produto) {
    listaProduto.add(produto)
}

fun registroCliente() {
    print("Olá cliente, quantos produtos deseja registrar? ")
    val quantProdutos = readlnOrNull()?.toIntOrNull()

    for (i in 1..quantProdutos!!) {
        print("Nome do produto $i: ")
        val nome = readlnOrNull() ?: ""
        print("Código de barras: ")
        val codBarras = readlnOrNull() ?: ""
        val dataValidade = LocalDate.now()
        println("Data de validade: $dataValidade")

        val produto = Produto(nome, codBarras, dataValidade)
        cadastrarProdutos(produto)

        println(produto)
    }
}

fun menuCliente(): Int? {
    println(
        "BEM VINDO(A)!\n" +
                "1. Registrar produto\n" +
                "2. Consultar produtos cadastrados\n" +
                "3. Sair"
    )
    val opcao = readlnOrNull()?.toIntOrNull()
    when (opcao) {
        1 -> {
            println()
            registroCliente()
        }

        2 -> produto.mostrarProdutosCadastrados()
        else -> println("Obrigado!")
    }
    return opcao
}



