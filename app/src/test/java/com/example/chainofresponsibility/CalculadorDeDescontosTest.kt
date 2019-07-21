package com.example.chainofresponsibility

import org.junit.Test
import org.junit.Assert.*

class CalculadorDeDescontosTest {

	@Test
	fun descontosMais5ProdutosTest() {
		val produto = Produto("Caneta", 50.0)
		val pedido =
			Pedido(300.0, mutableListOf(produto, produto, produto, produto, produto, produto))
		val desconto = CalculadorDeDescontos().calcula(pedido)
		assertEquals(30.0, desconto, 0.000001)
	}

	@Test
	fun descontoValorPedidoMaior500() {
		val produto = Produto("Caneta", 1000.0)
		val pedido = Pedido(1000.0, mutableListOf(produto))
		val desconto = CalculadorDeDescontos().calcula(pedido)
		assertEquals(70.0, desconto, 0.000001)
	}
}