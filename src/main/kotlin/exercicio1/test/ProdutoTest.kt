package exercicio1.test

import exercicio1.Produto
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
val produto = Produto(0.0,0.0,0.0)
class ProdutoTest() {
    private val produto1 = 20.0
    private val produto2 = 40.0
    private val produto3 = 30.0

    @Test
    fun testVerificarSeProdutoEMaisBaratoProdutoUm() {
        produto.verificarProdutoMaisBarato()
        assertEquals(produto1, 20.0)
    }

    @Test
    fun testVerificarSeProdutoEMaisBaratoProdutoDois() {
        produto.verificarProdutoMaisBarato()
        assertEquals(produto2, 20.0)
    }

    @Test
    fun testVerificarSeProdutoEMaisBaratoProdutoTres() {
        produto.verificarProdutoMaisBarato()
        assertEquals(produto3, 20.0)
    }
}
