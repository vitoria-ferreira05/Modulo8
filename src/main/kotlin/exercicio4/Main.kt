package exercicio4

val dadosUsuario = DadosUsuario(nome = "", profissao = "")
fun main() {
    var sair = false
    while (!sair) {
        println("------ Menu ------")
        println("1. Cadastrar habitante e profissão")
        println("2. Mostrar informações cadastradas de um habitante")
        println("3. Mostrar salários cadastrados")
        println("4. Calcular imposto de cada mês")
        println("5. Sair do sistema")
        print("Escolha uma opção: ")

        when (readln().toIntOrNull()) {
            1 -> {
                dadosUsuario.cadastrarUsuario()
            }
            2 -> {
                dadosUsuario.mostrarInformacoesCadastradas()
            }
        }
    }
}

