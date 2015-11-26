package ufpb.aps.calculadorProduto;

public class CalculadorProdutoImportado implements CalculadorProduto {

	@Override
	public double calcularPreco(double valor, int quantidade) {
		return valor*quantidade;
	}

}
