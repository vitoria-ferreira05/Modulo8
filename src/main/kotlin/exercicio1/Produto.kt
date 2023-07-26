package exercicio1

class Produto(private var produto1: Double, private var produto2: Double, private var produto3: Double) {
    fun receberPrecoDosProdutos() {

        try {
            print("Digite o preço do primeiro produto: R$")
            produto1 = readln().toDouble()

            print("Digite o preço do segundo produto: R$")
            produto2 = readln().toDouble()

            print("Digite o preço do terceiro produto: R$")
            produto3 = readln().toDouble()

        } catch (e: NumberFormatException) {
            println("Digite o valor com duas casas decimais, nesse formeto: 0.00")
        }

    }

    fun verificarProdutoMaisBarato() {

        if (produto1 <= produto2 && produto1 <= produto3) {
            println("O produto que deve comprar é o produto 1, pois é o mais barato.")
        } else if (produto2 <= produto1 && produto2 <= produto3) {
            println("O produto que deve comprar é o produto 2, pois é o mais barato.")
        } else {
            println("O produto que deve comprar é o produto 3, pois é o mais barato.")
        }
    }
}


