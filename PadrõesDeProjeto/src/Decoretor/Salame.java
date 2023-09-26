package Decoretor;

public class Salame extends Recheios  {
	protected double valorSalame;
	public Salame(Pao pao) {
		 
		System.out.println( pao.nome + " , " + getNome()+ " R$ =  " + getValorRecheio());
	}

	@Override
	public String getNome() {
	
		return "Salame";
	}

	@Override
	public double getValorRecheio() {
		
		return this.valorSalame = 3 +getValor(); 
	}
	
	

	
}
