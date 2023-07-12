package exercicio1

val caixa = Caixa()
fun main() {

    println("\n\t\t-----BEM VINDO(A) AO NOSSO SISTEMA------\n")

    var opcao: Int
    do {
        println(
            "Ola, você é funcionário ou cliente?" +
                    "\n1. Funcionário" +
                    "\n2. Cliente"
        )
        val usuario = readln().toInt()

        when (usuario) {
            1 -> {
                do {
                    opcao = caixa.mostrarMenuFuncionario()

                    when (opcao) {
                        1 -> {
                            println("-----Cadastro do produto-----")
                            print("Digite quantos produtos deseja cadastrar: ")
                            val quantProdutos = readln().toIntOrNull()

                            for (i in 1..quantProdutos!!) {

                                print("Nome do produto: ")
                                val nome = readlnOrNull() ?: ""
                                print("Valor: R$")
                                val valor = readlnOrNull()?.toDoubleOrNull() ?: 0.0
                                print("Quantidade: ")
                                val quantidade = readlnOrNull()?.toIntOrNull() ?: 0

                                val produto = Produto(nome, valor, quantidade)
                                caixa.cadastrarProdutos(produto)
                                println("Produto cadastrado com sucesso! :)\n")
                            }
                        }

                        2 -> {
                            println()
                            println("\t\t\t---Produtos cadastrados---\n")
                            caixa.exibirProdutosCadastrados()
                        }

                        3 -> {
                            println("\nObrigado por utilizar o nosso sistema")
                        }
                    }

                } while (opcao != 3)

            }

            2 -> {
                do {
                    opcao = caixa.mostrarMenuCliente()
                    when (opcao) {
                        1 -> {
                            println("-----Cadastro do produto-----")
                            print("Digite quantos produtos deseja cadastrar: ")
                            val quantProdutos = readln().toIntOrNull()

                            for (i in 1..quantProdutos!!) {

                                print("Nome do produto: ")
                                val nome = readlnOrNull() ?: ""
                                print("Valor: R$")
                                val valor = readlnOrNull()?.toDoubleOrNull() ?: 0.0
                                print("Quantidade: ")
                                val quantidade = readlnOrNull()?.toIntOrNull() ?: 0

                                val produto = Produto(nome, valor, quantidade)
                                caixa.cadastrarProdutos(produto)
                                println("Produto cadastrado com sucesso! :)\n")
                            }
                        }

                        2 -> {
                            println()
                            caixa.exibirProdutosCadastrados()
                        }

                        3 -> {
                            caixa.calcularValorTotal()
                        }

                        4 -> {
                            println("\nObrigado por utilizar o nosso sistema")
                        }

                        else -> {
                            println("\nPor favor, escolha uma opção válida.")
                        }
                    }
                } while (opcao != 4)
            }

            else -> println("\nPor favor, escolha uma opção válida.")
        }
    } while (usuario != 1 && usuario != 2)
}

