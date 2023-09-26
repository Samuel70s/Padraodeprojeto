package Strategy;

public class Itau implements StrategyJuros {

	@Override
	public int getValordoJuros(Produto pedido) {
		
		return 10;
	}

}
