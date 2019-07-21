package com.example.chainofresponsibility

data class Pedido(
	val valor: Double,
	val produtos: MutableList<Produto>
)