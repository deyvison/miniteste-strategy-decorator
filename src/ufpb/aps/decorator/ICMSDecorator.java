package ufpb.aps.decorator;

import ufpb.aps.calculadorProduto.CalculadorProduto;

public class ICMSDecorator extends ImpostoDecorator {

	public ICMSDecorator(CalculadorProduto componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPreco(double valor, int quantidade) {
		return (super.getComponente().calcularPreco(valor, quantidade) + (valor*0.5));
	}

}
