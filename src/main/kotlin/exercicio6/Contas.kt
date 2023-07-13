package exercicio6

open class Contas {
    open fun depositar() {}
    open fun sacar() {}
    open fun saldo() {}

    class ContaSalario(private val saldoAtual: Double = 1212.00, private var valorSaque: Double) : Contas() {

        override fun depositar() {

        }

        override fun sacar() {
            if (valorSaque < saldoAtual || valorSaque < 0) {
                println("Saldo insuficiente")
            } else {
                val saque = saldoAtual - valorSaque
                println(saque)
            }
        }

        override fun saldo() {

        }
    }

    class ContaPoupanca() : Contas() {

    }

    class ContaCorrente() : Contas() {

    }
}