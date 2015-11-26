package ufpb.aps.calculadorProduto;

public class CalculadorProdutoAgricola implements CalculadorProduto {

	@Override
	public double calcularPreco(double valor, int quantidade) {
		return valor*quantidade;
	}

}
