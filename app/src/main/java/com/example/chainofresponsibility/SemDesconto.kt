package com.example.chainofresponsibility

class SemDesconto: Desconto {
	override fun desconto(pedido: Pedido): Double {
		return 0.0
	}

	override fun setProximo(desconto: Desconto) {
		//NOP
	}
}