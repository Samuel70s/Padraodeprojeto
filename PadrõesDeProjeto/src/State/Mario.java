package State;

public class Mario  implements State  {

	
	public State MarioSuper() {
	System.out.println("Pegou um cogumelo: Tornou-se o Super Mario");
		return new MarioSuper();
	}

	
	public State MariodeFogo() {
		System.out.println("Pegou uma flor de fogo: Mario atira Fogo");
		return new MarioFire ();
	}

	
	public State MarioEstrela() {
		System.out.println("Pegou  a estrela: Mario está invencivel");
		return new MarioInvencivel();
	}

	
	public State colidircomIninimigo() {
		System.out.println("Morto");
		return new Mariomorto();
	}

	
	public String marioTipo() {
		
		return "Mario regular";
	}

	
}
