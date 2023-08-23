package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> itemList;


	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	

	public void adicionarItem (String nome, double preco, int qtd) {
		Item item = new Item(nome,preco,qtd);
		this.itemList.add(item);
		
	}
	
	public void removerItem(String nome) {
		List<Item> removerItem = new ArrayList<>();
		if(!itemList.isEmpty()) {
		for(Item i: itemList) {
			if(i.getNome().equalsIgnoreCase(nome)){
				removerItem.add(i);
			}
				
		} 
		itemList.removeAll(removerItem);
		} else {
			System.out.println("Carrinho vazio");
		}
	}
	
	public double calcularValorTotal() {
		/* Há 2 formas de valores a serem informados/calculados
		valor totalItem = preco*qtd
		valor total do carrinho =  valortotal + valorTotalItem
		*/
		double valorTotal = 0;
		if(!itemList.isEmpty()) {
			for(Item i: itemList) {
				double valorItem = i.getPreco() * i.getQtd();
				valorTotal += valorItem;
	
			}
			
		}
		
		return valorTotal;
	}
	
	public void exibirItens() {
		if(!itemList.isEmpty()) {
		System.out.println(this.itemList);
		}else {
			System.out.println("Lista vazia");
	}
		
	}
	
	public static void main (String[] args) {
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarItem("Caderno", 35.50, 2);
		carrinhoDeCompras.adicionarItem("Lápis", 2.30, 3);
		carrinhoDeCompras.adicionarItem("Lápis", 2.30, 3);
		carrinhoDeCompras.adicionarItem("Borracha", 2.25, 2);
		
		carrinhoDeCompras.exibirItens();
		
		
		carrinhoDeCompras.removerItem("Lápis");
		carrinhoDeCompras.exibirItens();
		
		System.out.println("O valor total da compra é: R$ " + carrinhoDeCompras.calcularValorTotal());

	}
}

	
