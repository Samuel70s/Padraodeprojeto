package Strategy;

public class Santander implements StrategyJuros {

	@Override
	public int getValordoJuros(Produto pedido) {
		
		return 40;
	}

}
