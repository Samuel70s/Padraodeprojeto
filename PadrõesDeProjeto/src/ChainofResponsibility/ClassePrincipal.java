package ChainofResponsibility;

public class ClassePrincipal {

	public static void main(String[] args) {
	 ConcreteHandler1 handler1 = new ConcreteHandler1();
	 ConcreteHandler2 handler2 = new ConcreteHandler2();
	 ConcreteHandler3 handler3 = new ConcreteHandler3();	
	 
	 
	 handler1.setNextHandler(handler2);
	 handler2.setNextHandler(handler3);
	 handler3.setNextHandler(handler1);
	 
	 
	 handler3.HandlerRequest(60);
	 handler1.HandlerRequest(1000);
	 handler2.HandlerRequest(20);
	}

}
