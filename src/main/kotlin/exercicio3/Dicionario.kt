package exercicio3

import java.util.ArrayList

fun main() {
    val dicionario = Dicionario()

    dicionario.adicionarTermoNoDicionario()
    dicionario.procurarTermoNoDicionario()
    dicionario.listarTodosOsTermosNoDicionario()
}

class Dicionario {

    private val listaTermos = ArrayList<String>()

    fun adicionarTermoNoDicionario() {
        print("\nTermos adicionados no dicionario: ")
        listaTermos.add("luz")
        listaTermos.add("amor")
        listaTermos.add("isenção")
        println(listaTermos)
    }

    fun procurarTermoNoDicionario() {
        println("\nSegundo termo do dicionario: ${listaTermos[1]}")
    }

    fun listarTodosOsTermosNoDicionario() {
        val termosEmOrdemAlfabetica = listaTermos.sorted()
        println("\nTodos os termos do dicionário em ordem alfabética: ${termosEmOrdemAlfabetica.joinToString(", ")}")
    }

}


