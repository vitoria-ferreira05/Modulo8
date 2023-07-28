package servicoDePedidos


class Oferta {
    private var maca = 0
    private var laranja = 0

    fun adicionarMacas(quantity: Int) {
        maca += quantity
    }

    fun adicionarLaranjas(quantity: Int) {
        laranja += quantity
    }

    fun comprarUmaMacaEganharUmaGratis(quantity: Int): Int {
        val macasGratis = quantity / 2
        val macasCompradas = quantity - macasGratis

        if (maca >= quantity) {
            maca -= quantity
        } else {
            return 0
        }

        return macasCompradas
    }

    fun comprarTresPorDuasLarnjas(quantity: Int): Int {
        val laranjasGratis = quantity / 3
        val laranjasCompradas = quantity - laranjasGratis

        if (laranja >= quantity) {
            laranja -= quantity
        } else {
            return 0
        }

        return laranjasCompradas
    }
}


