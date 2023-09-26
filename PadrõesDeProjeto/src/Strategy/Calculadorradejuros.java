package Strategy;


public class Calculadorradejuros {
	
	
	private StrategyJuros calculadoradejuros;
	
	
	
	
public Calculadorradejuros(StrategyJuros calculadoradejuros) {
	
	this.calculadoradejuros=  calculadoradejuros;
	
}
public int calculadordeJuros(Produto produto) {
	return this.calculadoradejuros.getValordoJuros(produto);
}

}
