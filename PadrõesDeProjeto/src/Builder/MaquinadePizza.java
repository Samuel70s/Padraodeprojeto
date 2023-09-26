package Builder;


/* Aula sobre padrão de projeto Builder*/
/* O padrão de projeto builder serve para ajudar na construção de objetos complexos. Assim diminuindo o numero de linhas
 * e aliviando o processamento do computador */


public class MaquinadePizza {
	public class Pizza{
	      private Pizza pizza;
	public Pizza() {
		pizza = new Pizza();
	}
	public Pizza setMassa(String tipo) {
		pizza.setMassa("fina");
		return this;
	}
	public Pizza setTemper(String tempero) {
		pizza.setTemper("Oregano");
		return this;
	}
	public Pizza setCliente(String Cliente) {
		pizza.setCliente("Bernado");
		return this;
	}
	public  Pizza pizzaz() {
		return pizza;
	}

}
}