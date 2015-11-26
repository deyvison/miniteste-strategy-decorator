package ufpb.aps.main;

import ufpb.aps.calculadorProduto.CalculadorProdutoAgricola;
import ufpb.aps.calculadorProduto.CalculadorProdutoAlimenticio;
import ufpb.aps.calculadorProduto.CalculadorProdutoImportado;
import ufpb.aps.decorator.CustoComAgrotoxicosDecorator;
import ufpb.aps.decorator.ICMSDecorator;
import ufpb.aps.decorator.ImpostoAgricolaDecorator;
import ufpb.aps.decorator.TaxaDeImportacaoDecorator;
import ufpb.aps.decorator.TaxaRegistroAlimentarDecorator;
import ufpb.aps.entity.Pedido;
import ufpb.aps.entity.Produto;

public class Main {
	
	public static void main(String[] args) {
		
		Pedido p = new Pedido();
		
		Produto p1 = new Produto("Veneno",500,2,new ImpostoAgricolaDecorator(new ICMSDecorator(new CustoComAgrotoxicosDecorator(new CalculadorProdutoAgricola()))));
		Produto p2 = new Produto("Celular",900,1,new TaxaDeImportacaoDecorator(new ICMSDecorator(new CalculadorProdutoImportado())));
		Produto p3 = new Produto("Feijão",7,5,new ICMSDecorator(new TaxaRegistroAlimentarDecorator(new CalculadorProdutoAlimenticio())));
		
		p.addProduto(p1);
		p.addProduto(p2);
		p.addProduto(p3);
		
		System.out.println(p1.calcularValor());
		System.out.println(p2.calcularValor());
		System.out.println(p3.calcularValor());
		System.out.println(p.totalCompra());
	}
}
