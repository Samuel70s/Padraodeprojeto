package ChainofResponsibility;

public class ConcreteHandler3 extends BaseHandler {
	public void HandlerRequest(int handler) {
	if( handler>=100) {
		
		System.out.println("Concrete Handler 3 lida com a solicitação  " + handler);
	}
	
	else {		
		super.HandlerRequest(handler);
	}
	}
}
