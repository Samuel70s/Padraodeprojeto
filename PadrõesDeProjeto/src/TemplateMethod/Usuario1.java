package TemplateMethod;

public class Usuario1 extends PassosdoDia  {

	@Override
	public void orar() {
		System.out.println("Agradecer o senhor por mais um  dia.");
		
	}

	@Override
	public void iraoBanheiro() {
		System.out.println("Ir ao banheiro se estiver com vontade. ");
		
	}

	@Override
	public void TomarCafé() {
		System.out.println("Tomar café para ficar bem forte :)");
		
	}

	@Override
	public void fazerosAfazeres() {
		System.out.println("Fazer as tarefas que mãe pede.");
		
	}

	@Override
	public void Estudar() {
		System.out.println("Começar o estudo para aprimorar e ter um bom futuro :)");
		
	}
	
}
