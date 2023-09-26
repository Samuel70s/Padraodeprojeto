package Strategy;

public class Caixa {

	public static void main(String[] args) {
		Produto pedido = new Produto(10);
		
		
		Calculadorradejuros calculadora = new Calculadorradejuros(new Santander());
		
		System.out.println(calculadora.calculadordeJuros(pedido));

	}

}
