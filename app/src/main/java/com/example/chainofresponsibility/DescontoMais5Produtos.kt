package com.example.chainofresponsibility

class DescontoMais5Produtos: Desconto {

	private lateinit var proximo: Desconto

	override fun desconto(pedido: Pedido): Double {
		if (pedido.produtos.size > 5) {
			return pedido.valor * 0.1
		} else {
			return proximo.desconto(pedido)
		}
	}

	override fun setProximo(desconto: Desconto) {
		proximo = desconto
	}
}