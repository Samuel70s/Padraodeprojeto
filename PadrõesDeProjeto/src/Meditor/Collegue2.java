package Meditor;

public class Collegue2 extends Collegue {

	public Collegue2(Mediator mediator) {
		super(mediator);
		
	}

	public void notify(Mediator menssage) {
		
		System.out.println("Suas Messagens "+" Usuario 2 "  + menssage);
	}
	
public void sed(String Mensage) {
		
		mediator.sed(Mensage, this);
	}


}
