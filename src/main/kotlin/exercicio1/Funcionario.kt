package exercicio1

fun main() {
    val novoFuncionario = Funcionario()

    novoFuncionario.nome = "Luis"
    novoFuncionario.sobrenome = "Silva"
    novoFuncionario.horasTrabalhadas = 10
    novoFuncionario.valorPorHora = 25.50

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8)
    novoFuncionario.calcularSalario()

    Funcionario().listarFuncionarios(ArrayList())
}

class Funcionario {
    var nome: String = ""
    var sobrenome: String = ""
    var horasTrabalhadas: Int = 0
    var valorPorHora: Double = 0.0

    constructor(nome: String, sobrenome: String, horasTrabalhadas: Int, valorPorHora: Double) {
        this.nome = nome
        this.sobrenome = sobrenome
        this.horasTrabalhadas = horasTrabalhadas
        this.valorPorHora = valorPorHora
    }

    constructor()

    fun nomeCompleto() {
        println("Nome completo: $nome $sobrenome")
    }

    fun calcularSalario() {
        val valorRecebidoMes = horasTrabalhadas * valorPorHora
        println("O funcionário vai receber no mês R$ $valorRecebidoMes")
    }

    fun incrementarHoras(valor: Int) {
        horasTrabalhadas += valor
    }

    fun listarFuncionarios(funcionarios: ArrayList<Funcionario>) {
        print("\n---LISTA DE FUNCIONARIOS---\n")
        print("-------------------------------------")
        val funcionario1 = Funcionario(nome, sobrenome, horasTrabalhadas, valorPorHora)

        funcionario1.nome = "João"
        funcionario1.sobrenome = "Alves"
        funcionario1.horasTrabalhadas = 9
        funcionario1.valorPorHora = 20.0
        funcionarios.add(funcionario1)

        val funcionario2 = Funcionario(nome, sobrenome, horasTrabalhadas, valorPorHora)
        funcionario2.nome = "Valeria"
        funcionario2.sobrenome = "Santos"
        funcionario2.horasTrabalhadas = 6
        funcionario2.valorPorHora = 18.0
        funcionarios.add(funcionario2)

        val funcionario3 = Funcionario(nome, sobrenome, horasTrabalhadas, valorPorHora)
        funcionario3.nome = "Maria Eduarda"
        funcionario3.sobrenome = "Gonçalves"
        funcionario3.horasTrabalhadas = 5
        funcionario3.valorPorHora = 16.0
        funcionarios.add(funcionario3)

        val funcionario4 = Funcionario(nome, sobrenome, horasTrabalhadas, valorPorHora)
        funcionario4.nome = "Luiza"
        funcionario4.sobrenome = "Nunes"
        funcionario4.horasTrabalhadas = 6
        funcionario4.valorPorHora = 19.0
        funcionarios.add(funcionario4)

        val funcionario5 = Funcionario(nome, sobrenome, horasTrabalhadas, valorPorHora)
        funcionario5.nome = "Guilherme"
        funcionario5.sobrenome = "Pereira"
        funcionario5.horasTrabalhadas = 5
        funcionario5.valorPorHora = 22.0
        funcionarios.add(funcionario5)

        val funcionario6 = Funcionario(nome, sobrenome, horasTrabalhadas, valorPorHora)
        funcionario6.nome = "Rafaela"
        funcionario6.sobrenome = "Lima"
        funcionario6.horasTrabalhadas = 4
        funcionario6.valorPorHora = 14.0
        funcionarios.add(funcionario6)

        val funcionario7 = Funcionario(nome, sobrenome, horasTrabalhadas, valorPorHora)
        funcionario7.nome = "Joana"
        funcionario7.sobrenome = "Aparecida"
        funcionario7.horasTrabalhadas = 8
        funcionario7.valorPorHora = 21.0
        funcionarios.add(funcionario7)

        val funcionario8 = Funcionario(nome, sobrenome, horasTrabalhadas, valorPorHora)
        funcionario8.nome = "Rosimeire"
        funcionario8.sobrenome = "Almeida"
        funcionario8.horasTrabalhadas = 7
        funcionario8.valorPorHora = 18.0
        funcionarios.add(funcionario8)

        val funcionario9 = Funcionario(nome, sobrenome, horasTrabalhadas, valorPorHora)
        funcionario9.nome = "Vitoria"
        funcionario9.sobrenome = "Ferreira"
        funcionario9.horasTrabalhadas = 6
        funcionario9.valorPorHora = 18.5
        funcionarios.add(funcionario9)


        for (funcionario in funcionarios) {
            println()
            println("${funcionario.nome} ${funcionario.sobrenome}")
            println("Horas trabalhadas: ${funcionario.horasTrabalhadas}")
            println("Valor por hora: ${funcionario.valorPorHora}")
            println("${funcionario.calcularSalario()}")
            print("-------------------------------------")
        }
    }
}