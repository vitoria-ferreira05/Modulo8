package exercicio6

fun main() {
    val contaSalario = Contas.ContaSalario()
    val contaPoupanca = Contas.ContaPoupanca()
    val contaCorrente = Contas.ContaCorrente(2000.00)


    contaSalario.deposito(500.00)
    contaSalario.saque(200.00)
    println()
    contaPoupanca.deposito(1000.00)
    contaPoupanca.saque(1500.00)
    println()
    contaCorrente.deposito(4000.00)
    contaCorrente.saque(5500.00)
    println()

    println("===== Conta Salário =====")
    contaSalario.exibirSaldo()
    contaSalario.deposito(500.00)
    contaSalario.saque(200.00)
    contaSalario.exibirSaldo()

    println("\n===== Conta Poupança =====")
    println("Digite o valor do depósito para a Conta Poupança:")
    val depositoPoupanca = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    contaPoupanca.deposito(depositoPoupanca)

    println("Digite o valor do saque da Conta Poupança:")
    val saquePoupanca = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    contaPoupanca.saque(saquePoupanca)
    contaPoupanca.exibirSaldo()

    println("\n===== Conta Corrente =====")
    println("Digite o valor do depósito para a Conta Corrente:")
    val depositoCorrente = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    contaCorrente.deposito(depositoCorrente)

    println("Digite o valor do saque da Conta Corrente:")
    val saqueCorrente = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    contaCorrente.saque(saqueCorrente)
    contaCorrente.exibirSaldo()
}
