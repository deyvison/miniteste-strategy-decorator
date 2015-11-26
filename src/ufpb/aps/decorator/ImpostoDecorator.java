package ufpb.aps.decorator;

import ufpb.aps.calculadorProduto.CalculadorProduto;

public abstract class ImpostoDecorator implements CalculadorProduto {
	
	
	private CalculadorProduto componente;
	
	public ImpostoDecorator(CalculadorProduto componente) {
		this.componente = componente;
	}
	@Override
	public abstract double calcularPreco(double valor, int quantidade);
	
	
	public CalculadorProduto getComponente() {
		return this.componente;
	}
	
}
