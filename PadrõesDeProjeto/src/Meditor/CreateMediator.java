package Meditor;

public class CreateMediator implements Mediator {
	protected Mediator Menssage;
	private Collegue1 collegue1;
	private Collegue2 collegue2;
	private Collegue3 collegue3;
	public void Notficação(Mediator Menssage) {
		this.Menssage = Menssage;
	}
	
	public void setCollegue1(Collegue1 collegue1) {
		this.collegue1 = collegue1;
	}
	
	public void setCollegue2(Collegue2 collegue2) {
		this.collegue2 = collegue2;
	}
	
	public void setCollegue3(Collegue3 collegue3) {
		this.collegue3 = collegue3;
	}
	

	@Override
	public void sed(String Mensage, Collegue collegue) {
		if(collegue == collegue1) {
			collegue3.notify(Menssage);
			collegue2.notify(Menssage);
			
		} else if (collegue == collegue2) {
			collegue1.notify(Menssage);
			collegue3.notify(Menssage);
		} else if (collegue == collegue3) {
			collegue2.notify(Menssage);
			collegue1.notify(Menssage);
		}
		
		}
	}
