package observerDesignPattern.NotifyBtn;

import java.util.List;
import java.util.ArrayList;

public class IphoneObservableImpl implements StocksObservable {
	private List<NotificationAlertObserver> observers;
	private int stocksCount;
	
	IphoneObservableImpl() {
		observers = new ArrayList<NotificationAlertObserver>();
		stocksCount = 0;
	}
	
	@Override
	public void register(NotificationAlertObserver ob) {
		// TODO Auto-generated method stub
		observers.add(ob);
	}
	@Override
	public void unregister(NotificationAlertObserver ob) {
		// TODO Auto-generated method stub
		observers.remove(ob);
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (NotificationAlertObserver ob : observers) {
			ob.update();
		}
	}
	@Override
	public void setStockCount(int stockCount) {
		// TODO Auto-generated method stub
		if (this.stocksCount == 0) {
			notifyObserver();
		}
		this.stocksCount += stockCount;
	}
	@Override
	public int getStockCount() {
		// TODO Auto-generated method stub
		return stocksCount;
	}
	
}
