package exercicio2

import kotlin.system.exitProcess

class Semana {

    fun exibirDiaDaSemana(){
        do {
            println("\t\t\tDIA DA SEMANA" +
                    "\nEscolha uma opção de 1 a 7 ou 0 para sair")
            try {
                when(readln().toInt()){
                    1 -> println("Domingo")
                    2 -> println("Segunda-Feira")
                    3 -> println("Terça-Feira")
                    4 -> println("Quarta-Feira")
                    5 -> println("Quinta-Feira")
                    6 -> println("Sexta-Feira")
                    7 -> println("Sábado")
                    0 -> exitProcess(0)
                    else -> println("Valor inválido")
                }
            }catch (e: NumberFormatException){
                println("Digite um número inteiro")
            }
        }while (true)
    }
}