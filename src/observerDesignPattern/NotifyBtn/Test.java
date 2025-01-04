package observerDesignPattern.NotifyBtn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		StocksObservable iphoneObservableImpl = new IphoneObservableImpl();
		NotificationAlertObserver ob1 = new MessageAlertObserverImpl("1234", iphoneObservableImpl);
		NotificationAlertObserver ob2 = new MessageAlertObserverImpl("9876", iphoneObservableImpl);
		NotificationAlertObserver ob3 = new EmailAlertObserverImpl("xyz@gmail.xom", iphoneObservableImpl);
		
		iphoneObservableImpl.register(ob2);
		iphoneObservableImpl.register(ob1);
		iphoneObservableImpl.register(ob3);
		
		iphoneObservableImpl.setStockCount(10);
	}

}
