package exercicio3

import java.math.BigDecimal

class ConversorMoedas {
    private val cotacaoMoedas = mutableMapOf<String, BigDecimal>()
    private lateinit var valor: BigDecimal

    fun adicionarCotacoes(
        cotacaoDolarAmericano: BigDecimal,
        cotacaoDolarCanadense: BigDecimal,
        cotacaoEuro: BigDecimal,
        cotacaoLibraEsterlina: BigDecimal
    ) {
        cotacaoMoedas["DÓLAR AMERICANO"] = cotacaoDolarAmericano
        cotacaoMoedas["DÓLAR CANADENSE"] = cotacaoDolarCanadense
        cotacaoMoedas["EURO"] = cotacaoEuro
        cotacaoMoedas["LIBRA ESTERLINA"] = cotacaoLibraEsterlina
    }

    fun converterMoeda(nomeMoeda: String, valor: BigDecimal): BigDecimal {
        val cotacao = cotacaoMoedas[nomeMoeda] ?: throw IllegalArgumentException("Moeda não encontrada")
        val roundingMode = BigDecimal.ROUND_HALF_EVEN
        return valor.multiply(cotacao).setScale(2, roundingMode)
    }
}
