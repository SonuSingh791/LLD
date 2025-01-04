package observerDesignPattern.NotifyBtn;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
	String emailId;
	StocksObservable observable;
	EmailAlertObserverImpl(String emailId, StocksObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}
	public void update() {
		sendMessage(this.emailId, "product is in stock, hurry up.");
	}
	
	public void sendMessage(String emailId, String msg) {
		System.out.println("Email sent to: " + emailId);
	}
}
