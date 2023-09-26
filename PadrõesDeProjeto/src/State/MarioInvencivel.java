package State;

public class MarioInvencivel implements State {

	@Override
	public State MarioSuper() {
		System.out.println("Pegou um cogumelo: Mais 1000 pontos ");
		return this;
	}

	@Override
	public State MariodeFogo() {
		System.out.println("Pegou uma flor de fogo: Mario atira fogo");
		return new MarioFire();
	}

	@Override
	public State MarioEstrela() {
		System.out.println("Continua Invencivel");
		return this;
	}

	@Override
	public State colidircomIninimigo() {
		System.out.println("O inimigo Morreu");
		return new MarioInvencivel();
	}

	@Override
	public String marioTipo() {
		
		return "Mario Invencivel";
	}

}
