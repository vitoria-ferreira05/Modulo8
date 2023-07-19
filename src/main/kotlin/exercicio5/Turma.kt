package exercicio5

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

class Turma : Aluno(matricula = "", nome = "", dataNasc = LocalDate.of(0,0,0), sexo = ""){

    fun cadastrarAlunos() {
        print("Matricula do(a) aluno(a): ")
        matricula = readln()
        print("Digite o nome do(a) aluno(a): ")
        nome = readln()
        print("Digite a data de nascimento do(a) aluno(a) no formato dd/MM/yyyy: ")
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        ((readlnOrNull() ?: "") as LocalDate).also { dataNasc = it }
        try {
            dataNasc = LocalDate.parse(dataNasc.toString(), formatter)
            println("Data digitada: $dataNasc")
        } catch (e: Exception) {
            println("Data inválida. Certifique-se de digitar no formato correto (dd/MM/yyyy).")
        }
        listaAlunos.add(Aluno(matricula, nome, dataNasc, sexo))
        println("Aluno cadastrado com sucesso!")
    }

    fun listarTodosOsAlunos(){
        listaAlunos.forEach(){
            print(it)
        }
    }

    fun listarAlunosPeloSobrenome(sobrenome: String){
        val alunosComSobrenomeInformado = listaAlunos.filter { aluno ->
            aluno.nome.split(" ").last().equals(sobrenome, ignoreCase = true)
        }

        if (alunosComSobrenomeInformado.isEmpty()) {
            println("Nenhum aluno encontrado com o sobrenome informado: $sobrenome")
        } else {
            println("Alunos com o sobrenome $sobrenome:")
            alunosComSobrenomeInformado.forEach { aluno ->
                println("${aluno.nome} (Matrícula: ${aluno.matricula})")
            }
        }
    }


    fun encontrarAlunoMaisIdoso(): String? {
        if (listaAlunos.isEmpty()) {
            println("A lista de alunos está vazia.")
            return null
        }

        val alunoMaisIdoso = listaAlunos.minByOrNull { it.dataNasc }
        return alunoMaisIdoso?.nome
    }

    private fun calcularIdade(dataNasc: LocalDate): Int {
        val dataAtual = LocalDate.now()
        val idade = Period.between(dataNasc, dataAtual).years
        return idade
    }

    fun calcularMediaIdadeAlunos(): Double {
        if (listaAlunos.isEmpty()) {
            println("A lista de alunos está vazia.")
            return 0.0
        }

        val totalAlunos = listaAlunos.size
        val somaIdades = listaAlunos.sumOf { calcularIdade(it.dataNasc) }
        val mediaIdade = somaIdades.toDouble() / totalAlunos.toDouble()

        return mediaIdade
    }

    fun atualizarAlunoPorMatricula(matriculaPesquisada: String) {
        val alunoEncontrado = listaAlunos.find { it.matricula == matriculaPesquisada }

        if (alunoEncontrado == null) {
            println("Nenhum aluno encontrado com a matrícula: $matriculaPesquisada")
            return
        }

        println("Aluno encontrado:")
        println("Matrícula: ${alunoEncontrado.matricula}")
        println("Nome: ${alunoEncontrado.nome}")
        println("Data de Nascimento: ${alunoEncontrado.dataNasc}")
        println("Sexo: ${alunoEncontrado.sexo}")

        println("\nDigite os novos dados do aluno:")

        print("Matrícula: ")
        val novaMatricula = readlnOrNull() ?: ""
        print("Nome: ")
        val novoNome = readlnOrNull() ?: ""
        print("Data de Nascimento (no formato dd/MM/yyyy): ")
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val novaDataNascStr = readlnOrNull() ?: ""
        var novaDataNasc: LocalDate? = null
        try {
            novaDataNasc = LocalDate.parse(novaDataNascStr, formatter)
        } catch (e: Exception) {
            println("Data inválida. A data de nascimento não foi atualizada.")
        }
        print("Sexo: ")
        val novoSexo = readlnOrNull() ?: ""

        // Atualiza os dados do aluno
        alunoEncontrado.matricula = novaMatricula
        alunoEncontrado.nome = novoNome
        if (novaDataNasc != null) {
            alunoEncontrado.dataNasc = novaDataNasc
        }
        alunoEncontrado.sexo = novoSexo

        println("Dados do aluno atualizados com sucesso.")
    }

//    fun main() {
//        // Supondo que a lista de alunos já esteja preenchida
//        // ...
//
//        println("Digite a matrícula do aluno que deseja atualizar:")
//        val matriculaPesquisada = readLine() ?: ""
//        atualizarAlunoPorMatricula(matriculaPesquisada)
//    }

    fun removerAlunoPorMatricula(matriculaPesquisada: String) {
        val alunoEncontrado = listaAlunos.find { it.matricula == matriculaPesquisada }

        if (alunoEncontrado == null) {
            println("Nenhum aluno encontrado com a matrícula: $matriculaPesquisada")
            return
        }

        listaAlunos.remove(alunoEncontrado)
        println("Aluno com matrícula $matriculaPesquisada removido com sucesso.")
    }

//    fun main() {
//        // Supondo que a lista de alunos já esteja preenchida
//        // ...
//
//        println("Digite a matrícula do aluno que deseja remover:")
//        val matriculaPesquisada = readLine() ?: ""
//        removerAlunoPorMatricula(matriculaPesquisada)
//    }

}

