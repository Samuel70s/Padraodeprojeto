package Command;

public class Portão {
public final int ABERTO = 0;
public final int FECHADO =1;
private int  estado = 0;
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
}
public void abrir() {
	this.estado = ABERTO;
	System.out.println("O portão abriu");
}
public void Fechar() {
	this.estado = FECHADO;
	System.out.println("O potão está fechado");
}
public String verEstado() {
	if(estado==ABERTO) {
		return "O portão está aberto";
	}
	else {
		return "O portão está fechado";
	}
}
}
