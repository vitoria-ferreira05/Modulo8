package exercicio1

class Caixa {
    private val listaProdutos = mutableListOf<Produto>()
    fun cadastrarProdutos(produto: Produto) {
        listaProdutos.add(produto)
    }

    fun exibirProdutosCadastrados() {

        val p1 = Produto("Macarrão Grano Duro Spaguetti N.5 Barilla 500g", 10.16, 5)
        val p2 = Produto("Almond Breeze, Alimento com Amêndoas e Coco, Rico em Vitamina E e Cálcio - 1l", 13.12, 2)
        val p3 = Produto("Macarrão Fettuccine Zero Carboidrato Konjac Massa Mf 270g", 22.90, 9)
        val p4 = Produto("Café Torrado e Moído Aroma de Chocolate Trufado Baggio Café 250g", 14.21, 4)
        val p5 = Produto("Energético Red Bull Energy Drink, 250ml ", 8.54, 20)


        caixa.cadastrarProdutos(p1)
        caixa.cadastrarProdutos(p2)
        caixa.cadastrarProdutos(p3)
        caixa.cadastrarProdutos(p4)
        caixa.cadastrarProdutos(p5)

        listaProdutos.forEach() {
            println(it)
        }
    }

    fun calcularValorTotal() {
        for (produto in listaProdutos) {
            val valorTotal = produto.valor * produto.quantidade
            println("Valor total: R$$valorTotal")
        }
    }


    fun mostrarMenuFuncionario(): Int {
        println(
            "\n\t----------MENU FUNCIONARIO----------\n\t\t\tEscolha uma opção:" +
                    "\n1. Cadastrar produto" +
                    "\n2. Exibir produtos cadastrados" +
                    "\n3. Sair do sistema"
        )

        return readln().toInt()
    }

    fun mostrarMenuCliente(): Int {
        println(
            "\n\t----------MENU CLIENTE----------\n\t\t\tEscolha uma opção:" +
                    "\n1. Cadastrar produto" +
                    "\n2. Exibir produtos cadastrados" +
                    "\n3. Calcular valor total" +
                    "\n4. Sair do sistema"
        )

        return readln().toInt()
    }
}

//cadastrar produtos
//exibir produtos cadastrados
//exibir valor total da somatoria de todos os produtos da lista