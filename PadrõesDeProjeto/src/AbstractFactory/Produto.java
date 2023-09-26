package AbstractFactory;

import java.math.BigDecimal;

public class Produto {
	private double Valor;
	private long Quantidade;
	private double imposto;
	private double valortot;
	private String nome;
	private BigDecimal ValorUnitario;
	public void setValorUnitario(BigDecimal i) {
		this.ValorUnitario = i;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
public double getValor() {
	return Valor*Quantidade;
}
public void setValor(double valor) {
	this.Valor = valor;
	
}

public long getQuant() {
	return Quantidade;
}

public void setQuant(long Quantidade) {
	this.Quantidade = Quantidade;
}
public double getImposto() {
	return Valor*0.18;
}
public void setImposto() {
	this.imposto = (Valor *0.18)*Quantidade;
}
public double getValorTot() {
	return (Valor*0.18) + Valor;
}

public BigDecimal getValorUnitario() {
	
	return ValorUnitario;
}
}

