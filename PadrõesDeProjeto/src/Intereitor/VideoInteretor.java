package Intereitor;

public class VideoInteretor implements Iteretor {
Locadora[]itens;
int posiçao = 0;
	public VideoInteretor(Locadora[]itens) {
		this.itens = itens;
	}
	public boolean hashNext() {
		if(posiçao>= itens.length || itens[posiçao] == null) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Object next() {
		Locadora videoItem = itens[posiçao];
		posiçao++;
		return  videoItem ;
		
	}

}
