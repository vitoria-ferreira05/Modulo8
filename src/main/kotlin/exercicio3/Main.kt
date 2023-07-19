package exercicio3

import java.math.BigDecimal
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val continuar = true

    println("Boas vindas ao conversor de moedas")

    while (continuar) {
        println("Digite a moeda que você quer converter:")
        println("Opções de moeda: Dólar americano, Dólar canadense, Euro, Libra Esterlina")

        val moeda = sc.nextLine().uppercase(Locale.getDefault())

        if (moeda != "DÓLAR AMERICANO" && moeda != "DÓLAR CANADENSE" && moeda != "EURO" && moeda != "LIBRA ESTERLINA"
        ) {
            throw IllegalArgumentException("Tipo de moeda inválido")
        }

        println("O programa só converte para Real (R$)")

        println("Digite o valor a ser convertido:")
        val valorString = sc.nextLine()

        if (valorString.isEmpty()) {
            throw NumberFormatException("Para moeda, o valor monetário deve ser um número decimal")
        }

        val valor: BigDecimal
        try {
            valor = BigDecimal(valorString)
            if (valor <= BigDecimal.ZERO) {
                println("Valor inválido, por favor, tente novamente")
                continue
            }
        } catch (e: NumberFormatException) {
            throw NumberFormatException("Para moeda, o valor monetário deve ser um número decimal")
        }

        val valorConvertido = ConversaoMoeda.converterMoeda(moeda, valor)

        val dateFormat: DateFormat = SimpleDateFormat("dd/MM/yyyy")
        val dataAtual = dateFormat.format(Date())

        println("A $moeda na cotação de hoje $dataAtual está em R\$ $valorConvertido, o valor")
    }
}

object ConversaoMoeda {
    private val cotacaoMoedas = mapOf(
        "DÓLAR AMERICANO" to BigDecimal("4.80"),
        "DÓLAR CANADENSE" to BigDecimal("3.64"),
        "EURO" to BigDecimal("5.37"),
        "LIBRA ESTERLINA" to BigDecimal("6.20")
    )

    fun converterMoeda(moeda: String, valor: BigDecimal): BigDecimal {
        val cotacao = cotacaoMoedas[moeda] ?: throw IllegalArgumentException("Moeda não encontrada")
        val roundingMode = BigDecimal.ROUND_HALF_EVEN
        return valor.multiply(cotacao).setScale(2, roundingMode)
    }
}
