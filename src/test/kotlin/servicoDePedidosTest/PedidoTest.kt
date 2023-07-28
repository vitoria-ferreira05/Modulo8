package servicoDePedidosTest

import org.junit.jupiter.api.Test
import servicoDePedidos.Pedido
import kotlin.test.assertEquals

class PedidoTest {
    private val pedido = Pedido()

    @Test
    fun deveRetornarOValorTotalDosPedidos() {
        val pedidos = listOf("Maça", "Maça", "Laranja", "Maça")
        val valorTotal = pedido.calcularValoresDosPedidos(pedidos)
        assertEquals(2.05, valorTotal, 0.01)
    }

    @Test
    fun deveRetornarSeListaDePedidosEstaVazia() {
        val pedidos = emptyList<String>()
        val valorTotal = pedido.calcularValoresDosPedidos(pedidos)
        assertEquals(0.0, valorTotal)
    }

}