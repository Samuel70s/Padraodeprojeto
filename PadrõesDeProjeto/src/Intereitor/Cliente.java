package Intereitor;


public class Cliente {
	public static void main(String args[]) {
	Locadora[] locadora = new Locadora[4];
    locadora [0] = new Locadora();
    locadora [1] = new Locadora();
    locadora [2] = new Locadora();
    locadora [3] = new Locadora();
    
    
    locadora[0].setNomeFilme("Gazparzinho");
    locadora[0].setPreco(20);
    locadora[1].setNomeFilme("Homem-Aranha De volta ao Lar ");
    locadora[1].setPreco(35);
    locadora[2].setNomeFilme("Lobo de Austrit");
    locadora[2].setPreco(40);
    locadora[3].setNomeFilme("X-man");
    locadora[3].setPreco(38);
    
    
    Iteretor video = new VideoInteretor(locadora);
    
    while(video.hashNext()) {
    	Locadora locador = (Locadora) video.next();
    	System.out.println(locador.getNomeFilme()+ " : R$ " + locador.getPreco());
    }
	}
}
