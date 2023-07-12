package exercicio2

import java.time.LocalDate
import java.time.Period

class Pessoa(
    private var nome: String,
    private var diaNasc: Int,
    private var mesNasc: Int,
    private var anoNasc: Int,
    private var idade: Int = 0
) {


    fun calculaIdade(diaAtual: Int, mesAtual: Int, anoAtual: Int) {
        val dataNascimento = LocalDate.of(anoNasc, mesNasc, diaNasc)
        val dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual)
        val periodo = Period.between(dataNascimento, dataAtual)
        idade = periodo.years
    }

    fun informarIdade(): Int {
        return idade
    }

    fun informarNome(): String {
        return nome
    }

    fun ajustaDataDeNascimento(dia: Int, mes: Int, ano: Int) {
        diaNasc = dia
        mesNasc = mes
        anoNasc = ano
    }
}

