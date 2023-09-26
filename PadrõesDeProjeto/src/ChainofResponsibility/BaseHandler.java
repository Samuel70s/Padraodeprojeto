package ChainofResponsibility;

public class BaseHandler implements Handler {

	private Handler NextHandler;
	public void setNextHandler(Handler handler) {
		NextHandler = handler;

	}

	public void HandlerRequest(int handler) {
	if(NextHandler!=null) {
		NextHandler.HandlerRequest(handler);
	}

	}

}
