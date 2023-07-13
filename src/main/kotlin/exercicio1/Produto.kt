package exercicio1

import java.time.LocalDate

data class Produto(var nome: String, var codBarras: String, var dataValidadade: LocalDate) {

    fun mostrarProdutosCadastrados() {
        val p1 = Produto("Macarrão Grano Duro Spaguetti N.5 Barilla 500g", "156445454", LocalDate.now() )
        listaProduto.add(p1)
        val p2 = Produto("Almond Breeze, Alimento com Amêndoas e Coco, Rico em Vitamina E e Cálcio - 1l", "564564156154", LocalDate.now())
        listaProduto.add(p2)
        val p3 = Produto("Macarrão Fettuccine Zero Carboidrato Konjac Massa Mf 270g", "54156415454", LocalDate.now())
        listaProduto.add(p3)

        listaProduto.forEach(){
            println(it)
        }
    }
}

