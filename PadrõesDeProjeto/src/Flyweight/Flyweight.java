package Flyweight;

import java.util.ArrayList;

public class Flyweight extends Split {
	
	protected MeutesteFlyweight imagem;
	
	ArrayList<String> desenho = new ArrayList();
	
	public String Flyweight(String DesenharImagem) {
		
		
		imagem = new MeutesteFlyweight(DesenharImagem);
		
		if(imagem.NomedaImagem==null) {
			
			 imagem = new MeutesteFlyweight(DesenharImagem);
			 
		desenho.add(imagem.NomedaImagem);
			
		}
		return imagem.NomedaImagem;
	}

	public void DesenharImagem(Ponto ponto) {
		
		imagem.Desenhar();
		
		System.out.println("No ponto" + ponto.x + "," + ponto.y);
		
	}
	

}
