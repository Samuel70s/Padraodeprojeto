package Bridge;

public interface Divice {
	// A interface "implementação" declara métodos comuns a todas as
	// classes concretas de implementação. Ela não precisa coincidir
	// com a interface de abstração. Na verdade, as duas interfaces
	// podem ser inteiramente diferentes. Tipicamente a interface de
	// implementação fornece apenas operações primitivas, enquanto
	// que a abstração define operações de alto nível baseada
	// naquelas primitivas.

	public boolean isEnable();

	public void Desligada();

	public void setVolume(int i);

	public int getCanal();

	public void setCanal(int i);

	
	
}
