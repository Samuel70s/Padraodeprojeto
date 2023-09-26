package Meditor;

public class Collegue3 extends Collegue {

public Collegue3(Mediator mediator) {
		super(mediator);
		
	}

public void notify(Mediator menssage) {
		
		System.out.println("Suas Messagens "+"  Usuario 3  " +menssage);
	}


public void sed(String Mensage) {
	
	mediator.sed(Mensage, this);
}
}
