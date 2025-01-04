package observerDesignPattern.NotifyBtn;

public interface StocksObservable {
	void register(NotificationAlertObserver ob);
	void unregister(NotificationAlertObserver ob);
	void notifyObserver();
	void setStockCount(int stockCount);
	int getStockCount();
}
