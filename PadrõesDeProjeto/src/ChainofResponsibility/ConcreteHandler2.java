package ChainofResponsibility;

public class ConcreteHandler2 extends BaseHandler {
	public void HandlerRequest(int handler) {
		if(handler>=50 && handler<=100) {
			
			System.out.println("Concrete Handler 2 lida com a solicitação  " + handler);
		}
		else {		super.HandlerRequest(handler);
		}

		}
}
