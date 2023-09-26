package Visitor;

public class Produto implements Visitor {
	private String produto;
	private double valorLiquido;
	private double valorFrete;
	private double valorTaxa;
	
public Produto(){
	this.produto = getProduto();
	this.valorLiquido = getValorLiquido();
	this.valorFrete = getValorFrete();
	this.valorTaxa = getValorTaxa();
}


	public void setProduto(String produto) {
		this.produto = produto;
	}
	
public void setValoriquido(double valor) {
	this.valorLiquido = valor;
}


public void setValorfrete(double valor) {
	this.valorFrete = valor;
}


public void setValortaxa(double valor) {
	this.valorTaxa = valor;
}


public String getProduto() {
	return produto;
}
public double getValorLiquido() {
	return valorLiquido;
}
public double getValorFrete() {
	return valorFrete;
}

public double getValorTaxa() {
	return valorTaxa;
}

public Object Visitor(Produto produto) {
	return (this);
}


@Override
public double Aceept(Produto produto) {
	
	return 0;
}



}
