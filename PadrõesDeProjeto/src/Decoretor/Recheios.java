package Decoretor;

public abstract class Recheios extends Frances {
	public double Recheios (Pao pao) {
		return getValorRecheio()+ getValor();
	}
public abstract String getNome();
public abstract double getValorRecheio();

}
