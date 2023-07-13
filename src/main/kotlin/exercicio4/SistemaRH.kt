package exercicio4

import java.time.LocalDate

val listaFuncionarios = mutableListOf<Funcionarios>()
val funcionarios = Funcionarios(nomeCompleto = "", setor = "", salario = 0.0, dataDeAdmissao = LocalDate.now())

fun main() {

    do {
        val opcao = menu()
        when (opcao) {
            1 -> {
                print("Quantos funcionarios deseja cadastrar?: ")
                val quantFuncionarios = readln().toIntOrNull()

                for (i in 1..quantFuncionarios!!) {
                    print("Digite o nome completo do funcionario $i : ")
                    val nomeCompleto = readln()
                    print(
                        "Digite o setor que $nomeCompleto trabalha: " +
                                "\n1. Tecnologia" +
                                "\n2. Financeiro" +
                                "\n3. Educação" +
                                "\n4. Marketing\n"
                    )
                    val setor = readln()
                    print("Digite o salário: R$ ")
                    val salario = readln().toDouble()
                    print("Data de admissão: " + LocalDate.now())

                    val funcionario = Funcionarios(nomeCompleto, setor, salario, dataDeAdmissao = LocalDate.now())
                    funcionarios.cadastrarNovosFuncionarios(funcionario)
                }
            }

                2 -> {
                    println()
                    exibirCadastros()
                }

                3 -> println("Obrigada")
                else -> println("Opção inválida")
            }
        } while (opcao != 3)
    }



fun exibirCadastros() {

    val func1setor1 =
        Funcionarios.Setor1("Anderson Mateus da Cunha", "Tecnologia", 3500.00, LocalDate.of(2015, 6, 5))
    listaFuncionarios.add(func1setor1)
    val func2setor1 = Funcionarios.Setor1("Daiane Laís da Costa", "Tecnologia", 2600.00, LocalDate.of(2020, 8, 10))
    listaFuncionarios.add(func2setor1)


    val func1Setor2 =
        Funcionarios.Setor2("Rosângela Antonella Costa", "Financeiro", 2000.00, LocalDate.of(2022, 11, 30))
    listaFuncionarios.add(func1Setor2)
    val func2Setor2 =
        Funcionarios.Setor2("Joana Renata Josefa Baptista", "Financeiro", 2800.00, LocalDate.of(2017, 12, 2))
    listaFuncionarios.add(func2Setor2)


    val func1Setor3 = Funcionarios.Setor2("Lucca Hugo Ruan Rocha", "Educação", 1800.00, LocalDate.of(2022, 11, 30))
    listaFuncionarios.add(func1Setor3)
    val func2Setor3 = Funcionarios.Setor2("Laís Julia Dias", "Educação", 2000.00, LocalDate.of(2022, 11, 30))
    listaFuncionarios.add(func2Setor3)

    val func1Setor4 =
        Funcionarios.Setor2("Vera Luciana dos Santos", "Marketing", 3000.00, LocalDate.of(2022, 11, 30))
    listaFuncionarios.add(func1Setor4)
    val func2Setor4 =
        Funcionarios.Setor2("Benjamin Tomás da Cunha", "Marketing", 2000.00, LocalDate.of(2022, 11, 30))
    listaFuncionarios.add(func2Setor4)

    listaFuncionarios.forEach() {
        println(it)
    }
}

fun menu(): Int? {
    println(
        "\n\t\t\t---MENU RH---\n" +
                "\n1. Cadastrar novo funcionario" +
                "\n2. Exibir funcionarios cadastrados" +
                "\n3. Sair"
    )
    return readln().toIntOrNull()
}
