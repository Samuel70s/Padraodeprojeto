package ChainofResponsibility;

public interface Handler {
	public void setNextHandler(Handler handler );
	public void HandlerRequest(int handler);

}
