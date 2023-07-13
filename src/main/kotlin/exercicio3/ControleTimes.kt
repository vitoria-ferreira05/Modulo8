package exercicio3

fun main() {
    val times = mutableListOf<Time>()

    val cruzeiro = Time.TimeFutebol("Cruzeiro", 25, 18)
    times.add(cruzeiro)

    val atletico = Time.TimeFutebol("Atlético Mineiro", 22, 20)
    times.add(atletico)

    val minas = Time.TimeVolei("Minas Tênis Clube", 12, 10)
    times.add(minas)

    val sesi = Time.TimeVolei("Sesi Vôlei Bauru", 15, 13)
    times.add(sesi)

    val minasBasket = Time.TimeBasquete("Minas Storm", 10, 8)
    times.add(minasBasket)

    val contagemBasket = Time.TimeBasquete("Contagem Towers", 12, 9)
    times.add(contagemBasket)

    for (time in times) {
        println(time)
        println()
    }
}