package exercicio3

open class Time(val nome: String, val quantidadeJogadores: Int, val vitorias: Int) {

    class TimeFutebol(nome: String, quantidadeJogadores: Int, vitorias: Int) :
        Time(nome, quantidadeJogadores, vitorias) {
        override fun toString(): String {
            return "Time de Futebol:\n" +
                    "Nome: $nome\n" +
                    "Quantidade de jogadores: $quantidadeJogadores\n" +
                    "Número de vitórias: $vitorias"
        }
    }

    class TimeBasquete(nome: String, quantidadeJogadores: Int, vitorias: Int) :
        Time(nome, quantidadeJogadores, vitorias) {
        override fun toString(): String {
            return "Time de Basquete:\n" +
                    "Nome: $nome\n" +
                    "Quantidade de jogadores: $quantidadeJogadores\n" +
                    "Número de vitórias: $vitorias"
        }
    }

    class TimeVolei(nome: String, quantidadeJogadores: Int, vitorias: Int) :
        Time(nome, quantidadeJogadores, vitorias) {
        override fun toString(): String {
            return "Time de Vôlei:\n" +
                    "Nome: $nome\n" +
                    "Quantidade de jogadores: $quantidadeJogadores\n" +
                    "Número de vitórias: $vitorias"
        }
    }
}


