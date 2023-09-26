package Observe;
import java.util.Observable;
import java.util.Observer;
public class Notification implements Observer{
private Observable Revistainformatica;
int ediçaoRevista;
public Notification( Observable Revistainformatica) {
	this.Revistainformatica = Revistainformatica;
	Revistainformatica.addObserver(this);
}

	@Override
	public void update(Observable RevistaSubject, Object arg1) {
		if(RevistaSubject instanceof Revistaveja ) {
			Revistaveja revistainformatica = (Revistaveja) RevistaSubject;
			ediçaoRevista = ((Revistaveja) RevistaSubject).getEdition();
			System.out.println("Já saiu adição da revista de informatica. " + 
			"Essa é a edição de numero " + ediçaoRevista);
		}
		
	}

}
