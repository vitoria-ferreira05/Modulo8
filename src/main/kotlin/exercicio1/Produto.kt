package exercicio1

class Produto(private var produto1: Double, private var produto2: Double, private var produto3: Double) {
    fun receberPrecoDosProdutos() {

        print("Digite o preço do primeiro produto: R$")
        produto1 = readln().toDouble()

        print("Digite o preço do segundo produto: R$")
        produto2 = readln().toDouble()

        print("Digite o preço do terceiro produto: R$")
        produto3 = readln().toDouble()
    }

        fun verificarProdutoMaisBarato() {

            val precoMaisBarato = when {
                produto1 <= produto2 && produto1 <= produto3 -> "Produto 1"
                produto2 <= produto1 && produto2 <= produto3 -> "Produto 2"
                else -> "Produto 3"
            }
            println("O produto que deve comprar é o $precoMaisBarato, pois é o mais barato.")
        }
    }


