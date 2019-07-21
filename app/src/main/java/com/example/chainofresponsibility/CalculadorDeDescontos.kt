package com.example.chainofresponsibility

class CalculadorDeDescontos {

	fun calcula(pedido: Pedido): Double {
		//mais de 5 itens, desconto
		if (pedido.produtos.size > 5) {
			return pedido.valor * 0.1
		} else if (pedido.valor > 500.0) {
			return pedido.valor * 0.07
		}
		return 0.0
	}
}