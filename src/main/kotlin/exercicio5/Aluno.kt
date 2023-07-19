package exercicio5

import java.time.LocalDate

open class Aluno (var matricula: String, var nome: String, var dataNasc: LocalDate, var sexo: String ) {

    val listaAlunos = mutableListOf<Aluno>()

}

