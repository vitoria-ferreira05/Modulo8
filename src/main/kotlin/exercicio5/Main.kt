package exercicio5

fun main(){
    val turma = Turma()
 do {
     val opcao: Int = 0

     println("\n\t\t--------BEM VINDO(A)!--------" +
             "\n Digite a opção desejada: " +
             "\n1. Cadastrar aluno: " +
             "\n2. Listar todos os alunos" +
             "\n3. Listar os alunos pelo sobrenome" +
             "\n4. Listar média de idade dos alunos" +
             "\n5. Atualizar os dados de um aluno, pesquisando por matrícula" +
             "\n6. Remover os dados de um aluno, pesquisando por matrícula")

     when(readln().toIntOrNull()){
         1 -> {
             turma.cadastrarAlunos()
         }
     }
 }while (opcao != 6)
}