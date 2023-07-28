package servicoDePedidosTest

import org.junit.jupiter.api.Test
import servicoDePedidos.Notificacao

class NotificacaoTest {
    private val notificacao = Notificacao()
    @Test
    fun testNotificarCliente() {
        val pedido = listOf("Maçã", "Laranja", "Maçã")
        notificacao.notificarCliente(pedido)
    }
}