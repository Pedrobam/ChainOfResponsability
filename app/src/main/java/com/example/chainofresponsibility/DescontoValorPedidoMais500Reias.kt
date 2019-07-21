package com.example.chainofresponsibility

class DescontoValorPedidoMais500Reias: Desconto {

	private lateinit var proximo: Desconto

	override fun desconto(pedido: Pedido): Double {
		if (pedido.valor > 500.0) {
			return pedido.valor * 0.07
		} else {
			return proximo.desconto(pedido)
		}
	}

	override fun setProximo(desconto: Desconto) {
		proximo = desconto
	}

}