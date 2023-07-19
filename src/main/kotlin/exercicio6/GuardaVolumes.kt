package exercicio6

class GuardaVolumes {
    private val dicionario: MutableMap<Int, ArrayList<Peca>> = mutableMapOf()
    private var contador: Int = 0

    fun guardarPecas(listaDePeca: ArrayList<Peca>): Int {
        dicionario[++contador] = listaDePeca
        return contador
    }

    fun mostrarPecas() {
        dicionario.forEach { (numero, pecas) ->
            println("Número de identificação: $numero")
            pecas.forEachIndexed { index, peca ->
                println("Peça ${index + 1}: Marca - ${peca.marca}, Modelo - ${peca.modelo}")
            }
            println()
        }
    }

    fun mostrarPecas(numero: Int) {
        val pecas = dicionario[numero]
        if (pecas != null) {
            println("Número de identificação: $numero")
            pecas.forEachIndexed { index, peca ->
                println("Peça ${index + 1}: Marca - ${peca.marca}, Modelo - ${peca.modelo}")
            }
            println()
        } else {
            println("Número de identificação $numero não encontrado.")
        }
    }

    fun devolverPecas(numero: Int) {
        dicionario.remove(numero)
        println("Peças associadas ao número de identificação $numero foram removidas.")
    }
}