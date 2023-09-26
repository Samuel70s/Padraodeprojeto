package State;

public class MarioSuper implements State {

	
	public State MarioSuper() {
		System.out.println("pegou um cogumelo: Ganha mais 1000 pontos");
		return this;
	}

	
	public State MariodeFogo() {
		System.out.println("pegou uma flor de fogo: Mario atira Fogo");
		return new MarioFire();
	}

	
	public State MarioEstrela() {
		System.out.println("Pegou uma estrela: Mario ficou invecivel");
		return new MarioInvencivel();
	}

	
	public State colidircomIninimigo() {
		System.out.println("Mario perdeu uma vida");
		return new  Mariomorto();
	}

	
	public String marioTipo() {
		
		return "Super Mario";
	}

}
