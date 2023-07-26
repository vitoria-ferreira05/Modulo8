package exercicio3.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class MaiorNumeroTest {

    @Test
    fun testMaiorNumero() {
        var maiorNumero = Int.MIN_VALUE
        val numerosDigitados = listOf(5, 8, 2, 10, 3)

        for (numero in numerosDigitados) {
            if (numero > maiorNumero) {
                maiorNumero = numero
            }
        }

        val resultadoEsperado = "\nO maior número é: 10"
        val resultadoObtido = "\nO maior número é: $maiorNumero"

        assertEquals(resultadoEsperado, resultadoObtido)
    }
}
