package ChainofResponsibility;

public class ConcreteHandler1 extends BaseHandler {
	public void HandlerRequest(int handler) {
		if(handler<100) {
		System.out.println("Concrete Handler 1 Lida com a solicitação "+ handler);
		}else {
			super.HandlerRequest(handler);
		}

		}

}
