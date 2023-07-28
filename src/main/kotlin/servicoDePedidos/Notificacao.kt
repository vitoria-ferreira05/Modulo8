package servicoDePedidos

class Notificacao {
    fun notificarCliente(pedido: List<String>) {
        println("Seu pedido foi concluído.")
        println("Status: Em trânsito")
        println("Tempo estimado de entrega: 30 minutos")
    }
}