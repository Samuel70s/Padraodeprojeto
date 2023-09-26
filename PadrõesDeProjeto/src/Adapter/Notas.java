package Adapter;

public class Notas implements BancoAdapter {
private static double nota;
	
	public double getNotas() {
		
		return nota;
	}

	
	public void setNotas(double notas) {
		
		this.nota = notas;
	}
	public void Conversor() {
		System.out.println("Valor em Real : R$ " + getNotas());
		System.out.println("Valor em dolar: USD " + getNotas()/5);
	}
	

}
