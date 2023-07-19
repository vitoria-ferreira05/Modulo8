package exercicio4

class DadosUsuario(nome: String, profissao: String) {
    private var nome: String = ""
    private var profissao: String = ""

    private val habitantes = mutableListOf<DadosUsuario>()
    private val profissoes = mutableListOf<String>()

    fun cadastrarUsuario() {

        print("\nNome: ")
         nome = readlnOrNull().toString()
        print("Profissão: ")
        profissao = readlnOrNull().toString()

        habitantes.add(DadosUsuario(nome, profissao))
        if (!profissoes.contains(profissao)) {
            profissoes.add(profissao)
        }
        println("Habitante cadastrado com sucesso!\n")
    }

    fun mostrarInformacoesCadastradas(){
        println("Digite o nome do habitante:")
        val nome = readlnOrNull()?.trim() ?: ""
        val habitante = habitantes.find { it.nome == nome }
        if (habitante != null) {
            println("Nome: ${dadosUsuario.nome}, Profissão: ${dadosUsuario.profissao}\n")
        } else {
            println("Habitante não encontrado.\n")
        }
    }
}

class Imposto {
    fun calcularImpostoDeRenda(renda: Double) {
        val imposto: Double

        if (renda >= 0.00 && renda <= 2000.00) {
            imposto = renda * 0.0
            println("Isento - Imposto : R$ $imposto")
        } else if (renda >= 2001.00 && renda <= 3000.00) {
            imposto = renda * 0.08
            println("Imposto: R$ $imposto")
        } else if (renda >= 3001.00 && renda >= 4500.00) {
            imposto = renda * 0.18
            println("Imposto: R$ $imposto")
        } else {
            imposto = renda * 0.28
            println("Imposto: R$ $imposto")
        }
    }
}

class RendaMensal {
    private val meses = listOf(
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    )

    private val salariosMensais = mutableMapOf<String, Double>()

    fun registrarSalarioMensal() {
        println("Digite o salário de SimCity com duas casas decimais para cada mês:")

        for (mes in meses) {
            print("Salário de $mes: R$")
            val salarioDoMes = readLine()?.toDoubleOrNull()

            if (salarioDoMes != null) {
                salariosMensais[mes] = salarioDoMes
            } else {
                println("Valor inválido. Certifique-se de digitar um valor numérico.")
                return
            }
        }
    }

    fun exibirSalariosMensais() {
        println("\nSalários mensais registrados:")
        for ((mes, salario) in salariosMensais) {
            println("$mes: R$ ${"%.2f".format(salario)}")
        }
    }
}


