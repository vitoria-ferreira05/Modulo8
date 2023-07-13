package exercicio4

import java.time.LocalDate

open class Funcionarios(
    val nomeCompleto: String,
    val setor: String,
    val salario: Double,
    val dataDeAdmissao: LocalDate
) {
    fun cadastrarNovosFuncionarios(funcionarios: Funcionarios) {
        listaFuncionarios.add(funcionarios)
    }

    class Setor1(nomeCompleto: String, setor: String, salario: Double, dataDeAdmissao: LocalDate) :
        Funcionarios(nomeCompleto, setor, salario, dataDeAdmissao) {
        override fun toString(): String {
            return "\nNome completo: $nomeCompleto" +
                    "\nSetor: $setor" +
                    "\nSalário: $salario" +
                    "\nData de admissão: $dataDeAdmissao"

        }
    }

    class Setor2(nomeCompleto: String, setor: String, salario: Double, dataDeAdmissao: LocalDate) :
        Funcionarios(nomeCompleto, setor, salario, dataDeAdmissao) {
        override fun toString(): String {
            return "\nNome completo: $nomeCompleto" +
                    "\nSetor: $setor" +
                    "\nSalário: $salario" +
                    "\nData de admissão: $dataDeAdmissao"
        }
    }

    class Setor3(nomeCompleto: String, setor: String, salario: Double, dataDeAdmissao: LocalDate) :
        Funcionarios(nomeCompleto, setor, salario, dataDeAdmissao) {
        override fun toString(): String {
            return "\nNome completo: $nomeCompleto" +
                    "\nSetor: $setor" +
                    "\nSalário: $salario" +
                    "\nData de admissão: $dataDeAdmissao"
        }
    }

    class Setor4(nomeCompleto: String, setor: String, salario: Double, dataDeAdmissao: LocalDate) :
        Funcionarios(nomeCompleto, setor, salario, dataDeAdmissao) {
        override fun toString(): String {
            return "\nNome completo: $nomeCompleto" +
                    "\nSetor: $setor" +
                    "\nSalário: $salario" +
                    "\nData de admissão: $dataDeAdmissao"
        }
    }
}