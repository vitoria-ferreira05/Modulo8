package servicoDePedidos

fun main() {
    val pedido = Pedido()
    val oferta = Oferta()

    println(
        "Seja bem-vindo(a)!" +
                "\nNossos produtos disponíveis para pedidos: Maçã e Laranja"
    )

    val input = readlnOrNull()
    if (!input.isNullOrBlank()) {
        val produtos = input.split(",").map { it.trim() }
        val precoTotal = pedido.calcularValoresDosPedidos(produtos)
        println("Total: R$${"%.2f".format(precoTotal)}")
    } else {
        println("Nenhum produto foi informado.")
    }

}
