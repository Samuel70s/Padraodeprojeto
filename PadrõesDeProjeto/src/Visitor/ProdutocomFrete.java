package Visitor;

public class ProdutocomFrete implements Visitor {

	@Override
	public double Aceept(Produto produto) {
	
		return produto.getValorLiquido()+produto.getValorFrete();
	}

	
	
}
