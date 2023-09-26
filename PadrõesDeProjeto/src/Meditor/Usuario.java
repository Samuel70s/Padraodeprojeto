package Meditor;

public class Usuario {

	public static void main(String[] args) {
		CreateMediator mediator = new CreateMediator();
		Collegue1 user1 = new Collegue1 (mediator);
		Collegue2 user2 = new Collegue2 (mediator);
		Collegue3 user3 = new Collegue3 (mediator);
		mediator.setCollegue1(user1);
		mediator.setCollegue2(user2);
		mediator.setCollegue3(user3);
		user1.sed("Como vai?");
		user2.sed("Tudo bem");
		

	}

}
