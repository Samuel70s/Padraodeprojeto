package Observe;
import java.util.Observable;
public class Revistaveja extends Observable{
	//A variavel edição vai indicar a edição que o cliente quer
	private int ediçao;
	public void setNovaediçao(int novaedicao) {
		this.ediçao = novaedicao;
		setChanged();
		notifyObservers();
		//Daqui vai ser pega a edição e vai sair a notificação.
	}
	public int getEdition() {
		return this.ediçao;
	}
	
}
