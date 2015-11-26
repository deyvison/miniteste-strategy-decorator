package ufpb.aps.decorator;

import ufpb.aps.calculadorProduto.CalculadorProduto;

public class ImpostoAgricolaDecorator extends ImpostoDecorator {

	public ImpostoAgricolaDecorator(CalculadorProduto componente) {
		super(componente);
	}

	@Override
	public double calcularPreco(double valor, int quantidade) {
		return super.getComponente().calcularPreco(valor, quantidade) + 100;
	}
	
	
}
