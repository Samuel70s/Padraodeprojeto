package Visitor;
/**
 *O padrão de projeto visitor serve para separar o algorimo dos objeto(s) estrutural , 
 *permitindo adicionar novos comportamentos sem mexer do algoritimo(Classe principal)*/

public class Cliente {

	public static void main(String[] args) {  
		Produto produto = new Produto();
		ProdutocomFrete frete = new ProdutocomFrete();
		
		produto.setProduto("Celular Samsung A10");
		produto.setValoriquido(700);
		produto.setValorfrete(40); 
		produto.setValortaxa(30);
		
		
		System.out.println("O seu produto: " + produto.getProduto() );
		System.out.println("O valor total do seu produto " +"R$ " +frete.Aceept(produto));
		System.out.println("O valor frete: " + "R$ "+ produto.getValorFrete());
		System.out.println("Valor Taxa: " + "R$ " + produto.getValorTaxa());
       
	}

}
