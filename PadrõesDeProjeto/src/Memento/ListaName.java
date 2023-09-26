package Memento;

public class ListaName {

	public static void main(String[] args) {
		
		Estado name = new Estado();
		
		Zelador zelador = new Zelador();
		
		name.setEstado("Samuel");
		
		zelador.setMemento(name.getSalvar());
		
		name.setEstado("Ana");

		
		System.out.println(name.getEstado());
		
		name.getRestaurarmemento(zelador.getMemento());
		
	    System.out.println(name.getEstado());
		

	}

}
