package exercicio5

fun main() {
    println("\n\t\t\tCACHORROS\n")
    val cachorro1 = Cachorro("Amora", "Pug", "Joana")
    cachorro1.mostrarInformacoes()
    cachorro1.movimentar()
    cachorro1.comer()
    cachorro1.dormir()

    val cachorro2 = Cachorro("Mel", "srd", "Maria")
    cachorro2.mostrarInformacoes()
    cachorro2.movimentar()
    cachorro2.comer()
    cachorro2.dormir()

    println("\n\t\t\tGATOS\n")
    val gato1 = Gato("Quindim", "Persa", "Lucas")
    gato1.mostrarInformacoes()
    gato1.movimentar()
    gato1.comer()
    gato1.dormir()

    val gato2 = Gato("Pietro", "Angorá", "Vanessa")
    gato2.mostrarInformacoes()
    gato2.movimentar()
    gato2.comer()
    gato2.dormir()

    println("\n\t\t\tPEIXES\n")
    val peixe1 = Peixe("Nemo", "Betta", "Vera")
    peixe1.mostrarInformacoes()
    peixe1.movimentar()
    peixe1.comer()
    peixe1.dormir()

    val peixe2 = Peixe("Splash", "Betta", "Jose")
    peixe2.mostrarInformacoes()
    peixe2.movimentar()
    peixe2.comer()
    peixe2.dormir()


}
