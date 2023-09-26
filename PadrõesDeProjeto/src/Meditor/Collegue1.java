package Meditor;

public class Collegue1 extends Collegue {

	public Collegue1(Mediator mediator) {
		super(mediator);
		
	}

	@Override
	public void sed(String Mensage) {
		
		mediator.sed(Mensage, this);
	}

public void notify(Mediator menssage) {
		
		System.out.println("Suas Messagens "+" Usuario 1 " + menssage);
	}
}
