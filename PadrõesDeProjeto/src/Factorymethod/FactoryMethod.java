package Factorymethod;

public class FactoryMethod {
	/*O padrão do Factory Method serve para a construção de objetos , mas o diferencial dele é que ele não depende da classe
	 * e nem do new. Ele permite que as classes abstratas decidam em qual classe o objeto será instaciado.*/
	 
	public class Poligono{
	public static poligon startpoligono (int newpoligono) {
		if(newpoligono==3) {
			return  new Triangulo();
		}
		else if (newpoligono == 4) {
			return new Squadro();
			}
		else if (newpoligono == 5) {
			return new Pengon();
		}
		return null;
	}
	}
}