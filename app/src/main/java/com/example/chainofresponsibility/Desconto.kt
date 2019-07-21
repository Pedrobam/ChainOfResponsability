package com.example.chainofresponsibility

interface Desconto {

	fun desconto(pedido: Pedido): Double
	fun setProximo(desconto: Desconto)
}