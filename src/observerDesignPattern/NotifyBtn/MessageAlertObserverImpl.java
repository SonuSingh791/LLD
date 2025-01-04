package observerDesignPattern.NotifyBtn;

public class MessageAlertObserverImpl implements NotificationAlertObserver {
	String phone;
	StocksObservable observable;
	MessageAlertObserverImpl(String phone, StocksObservable observable) {
		this.phone = phone;
		this.observable = observable;
	}
	public void update() {
		sendMessage(this.phone, "product is in stock, hurry up.");
	}
	
	public void sendMessage(String phone, String msg) {
		System.out.println("Message sent to: " + phone);
	}
}
