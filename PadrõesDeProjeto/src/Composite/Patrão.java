package Composite;

import java.util.ArrayList;

public class Patrão extends Funcionario {
ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
public Patrão(String Supervisor) {
	this.nomeFuncionario =Supervisor;
}
public  void PrintNomeFuncionario() {
	System.out.println(this.nomeFuncionario);
}

@Override
protected void AdicionarFuncionario(Funcionario funcionario) {
	this.funcionario.add(funcionario);
	
}

@Override
protected void RemoverFuncionario(Funcionario funcionario) {
	this.funcionario.remove(funcionario);
	
}
}
