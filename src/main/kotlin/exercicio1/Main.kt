package exercicio1

import kotlin.system.exitProcess

val calculoMatematico = CalculoMatematico()
fun main() {
    val op: Int = 0

    do {
        println(
            "Digite a opcao desejada:" +
                    "\n1. Calcular divisão" +
                    "\n2. Sair")
        when (readln().toInt()) {
            1 -> {
                val valores = getValoresDoUsuario()
                println("Primeiro numero: ${valores[0]}")
                println("Segundo numero: ${valores[1]}")

                calculoMatematico.divisao(valores[0], valores[1])

                try {
                    val resultado = calculoMatematico.divisao(valores[0], valores[1])
                    println("Resultado: $resultado")
                } catch (e: ArithmeticException) {
                    println("Erro: ${e.message}")
                }
            }
            2 -> exitProcess(0)
        }
    }while (op != 2)
}






