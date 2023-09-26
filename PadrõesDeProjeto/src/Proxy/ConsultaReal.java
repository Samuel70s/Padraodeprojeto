package Proxy;

public class ConsultaReal implements Hospital{
	
private Consulta consultareal;

private String consulta;

public ConsultaReal (String consulta) {
	
	this.consulta = consulta;
}
	
	public void Consultar() {
		if(consultareal== null) {
			consultareal = new 	Consulta(consulta);
		}
		consultareal.Consultar();
	}

}
