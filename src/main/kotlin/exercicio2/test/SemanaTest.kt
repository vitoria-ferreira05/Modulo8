package exercicio2.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

fun getDiaDaSemana(numeroDia: Int): String {
    return when (numeroDia) {
        1 -> "Domingo"
        2 -> "Segunda-Feira"
        3 -> "Terça-Feira"
        4 -> "Quarta-Feira"
        5 -> "Quinta-Feira"
        6 -> "Sexta-Feira"
        7 -> "Sábado"
        else -> "Valor inválido"
    }
}

class SemanaTest {
    @Test
    fun testExibirDiaDaSemana() {
        assertEquals("Domingo", getDiaDaSemana(1))
        assertEquals("Segunda-Feira", getDiaDaSemana(2))
        assertEquals("Terça-Feira", getDiaDaSemana(3))
        assertEquals("Quarta-Feira", getDiaDaSemana(4))
        assertEquals("Quinta-Feira", getDiaDaSemana(5))
        assertEquals("Sexta-Feira", getDiaDaSemana(6))
        assertEquals("Sábado", getDiaDaSemana(7))
        assertEquals("Valor inválido", getDiaDaSemana(8))
    }
}
