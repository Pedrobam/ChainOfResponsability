package com.example.chainofresponsibility

class CalculadorDeDescontos {

	fun calcula(pedido: Pedido): Double {
		val d1 = DescontoMais5Produtos()
		val d2 = DescontoValorPedidoMais500Reias()
		val d3 = SemDesconto()

		d1.setProximo(d2)
		d2.setProximo(d3)

		return d1.desconto(pedido)
	}
}