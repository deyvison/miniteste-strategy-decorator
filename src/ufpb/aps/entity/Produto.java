package ufpb.aps.entity;

import ufpb.aps.calculadorProduto.CalculadorProduto;

public class Produto {

	private String nome;
	private double custo;
	private int quantidade;
	private CalculadorProduto calculador;
	
	public Produto(String nome, double custo, int quantidade, CalculadorProduto calculador) {
		this.nome = nome;
		this.custo = custo;
		this.quantidade = quantidade;
		this.calculador = calculador;
	}
	
	
	public double calcularValor(){
		return this.calculador.calcularPreco(this.custo,this.quantidade);
	}
	
	
}
