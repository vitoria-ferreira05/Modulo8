package exercicio3

class MediaNotas {
    private fun validarNota(nota: Double): Boolean {
        return nota in 0.0..10.0
    }

    private fun receberNotas(): List<Double> {
        val notas: MutableList<Double> = mutableListOf()
        println("\t\t\t---Olá, professor(a) de SimCity---" +
                "\nInforme as notas do(s) aluno(s) e verifique a media semestral :)\n")
        for (i in 1..4) {
            var nota: Double
            do {
                print("Informe a nota da $i º avaliação:")
                nota = readln().toDoubleOrNull() ?: -1.0
                if (!validarNota(nota)) {
                    println("Nota inválida, você precisa informar a nota de 0 a 10.")
                }
            } while (!validarNota(nota))

            notas.add(nota)
        }

        return notas
    }

    private fun calcularMediaSemestral(notas: List<Double>): Double {
        return notas.average()
    }

    private fun realizarCalculoNovamente(): Boolean {
        var novoCalculo: Int
        do {
            print("\nNovo cálculo?" +
                    "\n1.Sim \n2.Não \n")
            novoCalculo = readln().toIntOrNull() ?: -1
        } while (novoCalculo != 1 && novoCalculo != 2)

        return novoCalculo == 1
    }

    fun efetuarVerificacao() {
        do {
            val notas = receberNotas()
            val mediaSemestral = calcularMediaSemestral(notas)

            println("Média = $mediaSemestral")

        } while (realizarCalculoNovamente())
    }
}


