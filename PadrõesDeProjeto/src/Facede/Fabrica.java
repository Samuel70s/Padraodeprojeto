package Facede;

public class Fabrica {
private HD hd;
private SO so;
private Gabinete gabinete;
private PlacadeVideo placadevideo;
private Processador processador;

public Fabrica() {
	this.gabinete = new Gabinete();
	this.hd = new HD();
	this.placadevideo = new PlacadeVideo();
	this.so = new SO();
	this.processador = new Processador();
}

public void MontarPc() {
	System.out.println("Fabricando");
	hd.adicionarHD();
	so.AdicionarSistemaOperacional();
	gabinete.AdicionarGabinete();
	placadevideo.AdicionarPlacadevideo();
	processador.AdicionarProcessador();
	System.out.println("Montando...");
}
}
