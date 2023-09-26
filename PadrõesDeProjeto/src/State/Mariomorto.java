package State;

public class Mariomorto implements State {

	@Override
	public State MarioSuper() {
		
		return this;
	}

	@Override
	public State MariodeFogo() {
		
		return this;
	}

	@Override
	public State MarioEstrela() {
		
		return this;
	}

	@Override
	public State colidircomIninimigo() {
		
		return this;
	}

	@Override
	public String marioTipo() {
	
		return "Morto";
	}

}
