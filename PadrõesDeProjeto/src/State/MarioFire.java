package State;

public class MarioFire implements State {

	
	public State MarioSuper() {
	System.out.println("Pegou o cogumelo: Mais 1000 pontos");
		return this;
	}

	
	public State MariodeFogo() {
		System.out.println("Continua com o poder de  fogo");
		return this;
	}

	
	public State MarioEstrela() {
		System.out.println("Pegou a estrela: Mario está inaencivel");
		return new MarioInvencivel();
	}

	public State colidircomIninimigo() {
		System.out.println("Mario voltou ao normal");
		return new  MarioSuper();
	}

	
	public String marioTipo() {
		
		return "Fire Mario";
	}

}
