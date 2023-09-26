package Composite;

public class Presidente extends Patrão{

	public Presidente(String Supervisor) {
		super(Supervisor);
		this.nomeFuncionario = Supervisor;
	}
	public  void PrintNomeFuncionario() {
		System.out.println(this.nomeFuncionario);
		for(Funcionario funcionariom : funcionario) {
			funcionariom.PrintNomeFuncionario();
		}
	}

	
	protected void AdicionarFuncionario(Funcionario funcionario) {
		
		
	}

	
	protected void RemoverFuncionario(Funcionario funcionario) {
		
	}

}
