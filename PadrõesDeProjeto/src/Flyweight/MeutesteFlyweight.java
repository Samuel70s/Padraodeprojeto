package Flyweight;

public class MeutesteFlyweight implements Desenho{
	protected String NomedaImagem;
public MeutesteFlyweight(String imagem) {
	NomedaImagem = imagem;
}
	
	public void Desenhar() {
		System.out.println(NomedaImagem + " Desenhada!");
		
	}
	public String getNome() {
		return NomedaImagem;
	}

}
