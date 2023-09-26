package Singleton;

public class Singleton {/**
Padrões de projeto*/
	/*O padrão Singleton serve paea fazer uma classe que não pode ser extendida e só pode existir apenas uma intancia(objeto)
	 *fazendo assim uma unica instancia. */
	//Projeto padrão do uso do Singleton
	private static Singleton instance;
	private Singleton() {
	instance= null;}
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	

	
	
	
	
	
}
