package exercicio3

fun main() {
    println("\n\t\t\t\t\t---LIVROS EM CARTAZ---")
    val filme1 = Filme(titulo = "")
    filme1.titulo = "Os vingadores"
    filme1.exibirDuracaoEmHoras(142)

    val filme2 = Filme(titulo = "")
    filme2.titulo = "Hotel Transilvânia"
    filme2.exibirDuracaoEmHoras(93)

    println("Os filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}")

    println("\n\t\t\t\t\t---LISTA DE FILMES---")
    Filme(titulo = "").listarNovoFilmes(ArrayList())

}

class Filme(var titulo: String) {

    fun exibirDuracaoEmHoras(minutos: Int): Pair<Int, Int> {
        val horas = minutos / 60
        val minutosRestantes = minutos % 60
        println("O filme $titulo possui $horas hora(s) e $minutosRestantes minutos de duração")
        return Pair(horas, minutosRestantes)

    }

    fun listarNovoFilmes(filme: ArrayList<Filme>) {

        val filme3 = Filme(titulo)
        filme3.titulo = "O Poderoso Chefão"
        filme3.exibirDuracaoEmHoras(175)
        filme.add(filme3)

        val filme4 = Filme(titulo)
        filme4.titulo = "Interestelar"
        filme4.exibirDuracaoEmHoras(169)
        filme.add(filme4)

        val filme5 = Filme(titulo)
        filme5.titulo = "A Origem"
        filme5.exibirDuracaoEmHoras(148)
        filme.add(filme5)

        val filme6 = Filme(titulo)
        filme6.titulo = "Clube da Luta"
        filme6.exibirDuracaoEmHoras(139)
        filme.add(filme6)

        val filme7 = Filme(titulo)
        filme7.titulo = "Tempo de Violência"
        filme7.exibirDuracaoEmHoras(154)
        filme.add(filme7)

        filme.forEach { filmes ->
        }
    }
}
