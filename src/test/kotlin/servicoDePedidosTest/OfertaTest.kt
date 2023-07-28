package servicoDePedidosTest

import org.junit.jupiter.api.Test
import servicoDePedidos.Oferta
import kotlin.test.assertEquals


class OfertaTest {
    @Test
    fun deveRetornarQuantidadeDeMacasGratis() {
        val oferta = Oferta()
        oferta.adicionarMacas(5)
        assertEquals(1, oferta.comprarUmaMacaEganharUmaGratis(2))
    }

    @Test
    fun deveRetornarQuantidadeDeLarnjasComprasEGratis() {
        val oferta = Oferta()
        oferta.adicionarLaranjas(7)
        assertEquals(5, oferta.comprarTresPorDuasLarnjas(7))
        assertEquals(0, oferta.comprarTresPorDuasLarnjas(2))
    }
}