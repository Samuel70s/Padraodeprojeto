package Command;

public class CommandAberto implements Command {

	private Portão portao;
	public CommandAberto(Portão portao) {
		this.portao = portao;
	}
	public void execute() {
		portao.abrir();
		
	}

	public void undo() {
		portao.Fechar();
		
	}

}
