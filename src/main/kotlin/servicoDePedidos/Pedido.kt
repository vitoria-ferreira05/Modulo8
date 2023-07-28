package servicoDePedidos


class Pedido {
    private val produtos = mapOf("Maça" to 0.60, "Laranja" to 0.25)
    fun calcularValoresDosPedidos(pedidos: List<String>): Double{

        val quantidade = mutableMapOf<String, Int>()

        for (pedido in pedidos){
            quantidade[pedido] = quantidade.getOrDefault(pedido, 0) + 1
        }

        var total = 0.0

        for ((pedido, quant) in quantidade ){
            val preco = produtos[pedido] ?: 0.0
            total += preco * quant
        }
        return total
    }

}