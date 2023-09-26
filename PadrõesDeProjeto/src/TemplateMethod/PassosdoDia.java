package TemplateMethod;

public abstract class PassosdoDia {
	private String oracao;
	private boolean Banheiro;
	private String tomarcafe;
	private String FazerTarefas;
	private String Estudar;
	public final void executar() {
	   orar();
	   iraoBanheiro();
	   TomarCafé();
	   fazerosAfazeres();
	   Estudar();
	}
	
	public abstract void  orar();
	public abstract void iraoBanheiro();
	public abstract void TomarCafé();
	public abstract void  fazerosAfazeres();
	public abstract void Estudar();
	
	
public void  Orar(String oracao) {
	this.oracao = oracao;		
}


public void isIrBanheiro(boolean banheiro) {
		this.Banheiro = banheiro;
}


public void TomarCafe(String cafe) {
	this.tomarcafe = cafe;
}


public void FazerTarefas(String Tarefa) {
		this.FazerTarefas = Tarefa;
}

public void Estudos(String estudos) {
	this.Estudar = estudos;
}

	
}
