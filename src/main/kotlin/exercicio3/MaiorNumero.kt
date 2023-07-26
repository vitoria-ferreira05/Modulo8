package exercicio3

class MaiorNumero {
    fun mostrarMaiorNumero() {
        var maiorNumero = Int.MIN_VALUE

        for (i in 1..5) {
            print("\nDigite o numero $i: ")
            val numeroDigitado = readln().toInt()

            if (numeroDigitado > maiorNumero) {
                maiorNumero = numeroDigitado
            }
        }
        println("\nO maior número é: $maiorNumero")

    }
}