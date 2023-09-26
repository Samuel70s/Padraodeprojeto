package Command;

public class Controle {
private Command[] comand;
private Command UltimoCommand;
public Controle(Command abrirCommand , Command FecharCommand) {
	this.comand = new Command[2];
	comand[0] = abrirCommand;
	comand [1] = FecharCommand;
}
	public void  Abrirportão() {
		comand[1].execute();
		UltimoCommand = comand[1];
	}
	
public void fecharPortoa() {
	comand[0].execute();
	UltimoCommand = comand[0];
}
	public void desfazer() {
		UltimoCommand.undo();
	}
	
}


