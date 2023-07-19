package exercicio2

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val listaCompras = ListaDeCompras()
    var continuarLista = true

    while (continuarLista) {
        println("---LISTA DE COMPRAS---" +
                "\n 1. Adicionar alimento na lista" +
                "\n 2. Mostrar a lista de compras" +
                "\n 3. Sair da lista")

        println("Escolha uma opcao:")
        val opcao = sc.nextInt()

        when (opcao) {
            1 -> {
                try {
                    listaCompras.adicionarAlimento()
                } catch (erro: Exception) {
                    println("Erro: ${erro.message}")
                }
            }
            2 -> listaCompras.mostrarListaCompras()
            3 -> continuarLista = false
            else -> println("Opção inválida. Escolha novamente.")
        }
    }
}
