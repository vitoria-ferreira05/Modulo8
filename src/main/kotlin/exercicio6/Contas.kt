package exercicio6

open class Contas(var saldo: Double) {
    open fun deposito(valor: Double) {
        saldo += valor
        println("Depósito de R$ $valor realizado. Novo saldo: R$ $saldo")
    }

    open fun saque(valor: Double) {
        if (valor > saldo) {
            println("Saldo insuficiente")
        } else {
            saldo -= valor
            println("Saque de R$ $valor realizado. Novo saldo: R$ $saldo")
        }
    }

    open fun exibirSaldo() {
        println("Saldo atual: R$ $saldo")
    }

    class ContaSalario : Contas(1212.00) {
        override fun deposito(valor: Double) {
            println("Conta Salário só pode receber depósito do empregador.")
        }
    }

    class ContaPoupanca() : Contas(0.00) {
        override fun deposito(valor: Double) {
            saldo += valor
            println("Depósito de R$ $valor realizado. Novo saldo: R$ $saldo")
        }
    }

    class ContaCorrente(saldoInicial: Double) : Contas(saldoInicial) {
        override fun deposito(valor: Double) {
            if (valor > 5000.00) {
                println("Operação inválida, procure a sua agência.")
            } else {
                saldo += valor
                println("Depósito de R$ $valor realizado. Novo saldo: R$ $saldo")
            }
        }
    }
}