package Strategy;

public class Bradesco implements StrategyJuros{

	@Override
	public int getValordoJuros(Produto pedido) {
		
		return 20;
	}

}
