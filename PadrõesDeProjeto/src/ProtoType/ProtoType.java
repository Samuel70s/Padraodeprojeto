package ProtoType;
/* O Padrão de projeto protoType serve para fazer uma copia do objeto desejado . Ele simplifica toda uma caminhada
 * que teria que ser feita, sem ele seria necessario repitir todas as linhas e todas a inplementações do objeto original
 * ele torna isso mais simples.*/
public class ProtoType {
private long altura;
private long peso;
private String nome;
public ProtoType() {}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public  long getPeso() {
	return peso;
}
public void setPeso(long peso) {
	this.peso =peso;
}
public long getAltura() {
	return altura;
}
public void setAltura(long altura) {
	this.altura =altura;
}

public ProtoType Clonar() {
	ProtoType Pclone = new ProtoType();
	Pclone.setAltura(this.altura);
	Pclone.setPeso(this.peso);
	Pclone.setNome(this.nome);
	return Pclone;
	
}
//--------------------------------------------------------------------------------------------------------------------------


public class Pessoa{
private long altura;
private long peso;
private String nome;
	public Pessoa() {}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public  long getPeso() {
		return peso;
	}
	public void setPeso(long peso) {
		this.peso =peso;
	}
	public long getAltura() {
		return altura;
	}
	public void setAltura(long altura) {
		this.altura =altura;
	}
private Pessoa(Pessoa ObjetoOrigem) {
	this.altura = ObjetoOrigem.getAltura();
	this.nome = ObjetoOrigem.getNome();
	this.peso = ObjetoOrigem.getPeso();
      
  
  }

public Pessoa Clone() {
	return new Pessoa(this);
	
}


}
	

}
