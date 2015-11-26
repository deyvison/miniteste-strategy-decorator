package ufpb.aps.decorator;

import ufpb.aps.calculadorProduto.CalculadorProduto;

public class CustoComAgrotoxicosDecorator extends ImpostoDecorator{

	public CustoComAgrotoxicosDecorator(CalculadorProduto componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPreco(double valor, int quantidade) {
		return super.getComponente().calcularPreco(valor, quantidade)+ 10 * quantidade;
	}

}
