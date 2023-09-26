package Visitor;

public class PodutoSemfrete implements Visitor {

	@Override
	public double Aceept(Produto produto) {
		
		return produto.getValorLiquido();
	}



}
