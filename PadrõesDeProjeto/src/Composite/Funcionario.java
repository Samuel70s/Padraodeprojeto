package Composite;

public abstract class  Funcionario {
	String nomeFuncionario;
	public  void PrintNomeFuncionario() {
		System.out.println(this.nomeFuncionario);
	}
protected abstract void AdicionarFuncionario(Funcionario funcionario);
protected abstract void RemoverFuncionario(Funcionario funcionario);

}
