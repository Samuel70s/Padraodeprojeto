package Command;

public class Commandfechado implements Command {
private Portão portao;
	public Commandfechado(Portão portao) {
		this.portao = portao;
	}
	public void execute() {
		portao.Fechar();
		
	}

	
	public void undo() {
		
		portao.abrir();
	}

}
