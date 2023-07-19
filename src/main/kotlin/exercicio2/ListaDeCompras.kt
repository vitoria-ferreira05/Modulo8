package exercicio2

import java.util.*

class ListaDeCompras {
    private val sc = Scanner(System.`in`)
    private val verdura = ArrayList<NomeAlimento>()
    private val legume = ArrayList<NomeAlimento>()
    private val grao = ArrayList<NomeAlimento>()
    private val outros = ArrayList<NomeAlimento>()

    fun adicionarAlimento() {
        println("Digite o tipo de alimento:" +
                "\n  - VERDURA" +
                "\n  - LEGUME" +
                "\n  - GRAOS" +
                "\n  - OUTROS")
        val tipo = sc.nextLine().uppercase(Locale.getDefault())

        if (!tipo.equals("VERDURA", true) && !tipo.equals("LEGUME", true) && !tipo.equals("GRAOS", true) && !tipo.equals(
                "OUTROS",
                true
            )
        ) {
            throw IllegalArgumentException("Tipo de alimento inválido")
        }

        println("Digite a quantidade:")
        val qtdade = sc.nextLine()

        if (qtdade.isEmpty()) {
            throw UnsupportedOperationException("Não é permitido inserir valor vazio")
        }

        val quantidade: Double
        try {
            quantidade = qtdade.toDouble()
        } catch (erro: NumberFormatException) {
            throw NumberFormatException("A quantidade deve ser um número válido")
        }

        if (tipo.equals("VERDURA", true) || tipo.equals("GRAOS", true)) {
            if (quantidade % 1 == 0.0) {
                throw NumberFormatException("Para verdura ou grãos, a quantidade deve ser informada com ponto")
            }
        } else {
            if (quantidade % 1 != 0.0) {
                throw NumberFormatException("Para legume ou outros, a quantidade deve ser informada em unidades inteiras")
            }
        }

        println("Digite o nome do alimento:")
        val nome = sc.nextLine()

        if (nome.isEmpty()) {
            throw UnsupportedOperationException("Não é permitido inserir nome vazio")
        }

        val nomeAlimento = NomeAlimento(nome, quantidade)

        when {
            tipo.equals("VERDURA", true) -> verdura.add(nomeAlimento)
            tipo.equals("LEGUME", true) -> legume.add(nomeAlimento)
            tipo.equals("GRAOS", true) -> grao.add(nomeAlimento)
            else -> outros.add(nomeAlimento)
        }
    }

    fun mostrarListaCompras() {
        println("Lista de compras:")
        println("Verduras:")
        for (nomeAlimento in verdura) {
            println("${nomeAlimento.getNomeDoAlimento()} - ${nomeAlimento.getQtdade()} gramas")
        }
        println("Legumes:")
        for (nomeAlimento in legume) {
            println("${nomeAlimento.getNomeDoAlimento()} - ${nomeAlimento.getQtdade()} unidades")
        }
        println("Graos:")
        for (nomeAlimento in grao) {
            println("${nomeAlimento.getNomeDoAlimento()} - ${nomeAlimento.getQtdade()} gramas")
        }
    }
}

