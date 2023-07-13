package exercicio2

import java.util.ArrayList

fun main(){
    val listaFormas = ArrayList<Forma>()

    val circulo1 = Forma.Circulo(2f)
    listaFormas.add(circulo1)
    val quadrado1 = Forma.Quadrado(6f)
    listaFormas.add(quadrado1)
    val retangulo1 = Forma.Retangulo(3f, 5f)
    listaFormas.add(retangulo1)
    val retangulo2 = Forma.Retangulo(2f, 4f)
    listaFormas.add(retangulo2)
    val circulo2 = Forma.Circulo(5f)
    listaFormas.add(circulo2)

    for (formas in listaFormas){
        println("Area: ${formas.calcularArea()}\n" +
                "Perimetro: ${formas.calcularPerimetro()}\n")
    }


}