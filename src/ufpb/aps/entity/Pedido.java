package ufpb.aps.entity;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private List<Produto> produtos;
	
	
	public Pedido(){
		this.produtos = new ArrayList<Produto>();
	}
	
	public void addProduto(Produto p){
		this.produtos.add(p);
	}
	
	public double totalCompra(){
		double total = 0.0;
		for(Produto p : this.produtos){
			total+= p.calcularValor();
		}
		return total;
	}
}
