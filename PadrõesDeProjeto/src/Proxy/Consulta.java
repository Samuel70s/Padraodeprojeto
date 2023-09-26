package Proxy;

public class Consulta implements Hospital {
	private  String consulta;
	public Consulta(String consulta) {
	this.consulta = consulta;
	Consultando(consulta);
}

public void Consultar() {
	System.out.println("Resultado da consulta: " + consulta +";"+ " resultado da consulta... ");
	
}
public void Consultando(String consulta) {
	System.out.println("Carregando consulta de " + consulta + "...");
}
}
