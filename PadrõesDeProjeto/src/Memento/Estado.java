package Memento;

public class Estado {
	
private String estado;

public void  setEstado(String estado) {
	
	this.estado = estado;
}
public String getEstado() {
	return estado;
}
public Memento getSalvar() {
	
	return new Memento(estado);
}

public void getRestaurarmemento(Memento memento) {
	
	estado = memento.getEstadosalvo();
	
}

}
