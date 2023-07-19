package exercicio1

import java.util.*

class CalculoMatematico {
    fun divisao(dividendo: Int, divisor: Int): Int {
        if (divisor == 0) {
            throw ArithmeticException("O divisor não pode ser igual a zero.")
        }
        return dividendo / divisor
    }

}
fun getValoresDoUsuario(): IntArray {
    val valores = IntArray(2)
    val scanner = Scanner(System.`in`)

    print("Digite o primeiro numero: ")
    valores[0] = scanner.nextInt()

    print("Digite o segundo numero: ")
    valores[1] = scanner.nextInt()

    return valores
}



