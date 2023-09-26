package Bridge;

public class Controle {
	
	// A "abstração" define a interface para a parte "controle" das
	// duas hierarquias de classe. Ela mantém uma referência a um
	// objeto da hierarquia de "implementação" e delega todo o
	// trabalho real para esse objeto.

private int volume = 50;
private int Chanell = 1;
private boolean Pawer;
protected Divice  divice;

public void controle(Divice divice) {
	
	this.divice = divice;
}

public void getPawer() {
	if(divice.isEnable()) {
		divice.Desligada();
		
	}else {
		divice.isEnable();
	}

	
}

public void setVolumeAbaixar() {
	divice.setVolume(getVolume()-10);
}

public void setVolumeAumentar() {
	divice.setVolume(getVolume()+10);
}

private int getVolume() {
	return volume;
	}


public void setCanalProximo() {
	divice.setCanal(divice.getCanal()+1);
}


public void setCanalAnterior() {
	divice.setCanal(divice.getCanal()-1);
}


}

