package Composite;

public class Empresa {

	public static void main(String[] args) {
	Patrão patrao = new Patrão("Samuel");
patrao.AdicionarFuncionario(patrao);
patrao.PrintNomeFuncionario();
	}

}
