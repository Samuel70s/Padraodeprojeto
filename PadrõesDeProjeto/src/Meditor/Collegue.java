package Meditor;

public abstract class Collegue {
protected Mediator mediator;
public Collegue(Mediator mediator) {
	this.mediator = mediator;
}
public void sed(String Mensage) {
	mediator.sed(Mensage, this);
	
}
}
