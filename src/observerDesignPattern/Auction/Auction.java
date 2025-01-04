package observerDesignPattern.Auction;

import java.util.*;

public class Auction implements Subject{
	private List<Observer> observers = new ArrayList<Observer>();
	private double currentPrice = 0;
	private double maxPrice = 0;
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer: observers) {
			observer.update(this.maxPrice);
		}
	}
	
	public void setPrice(double price) {
		this.currentPrice = price;
		if (this.currentPrice > this.maxPrice) {
			this.maxPrice = this.currentPrice;
			notifyObservers();
		}
	}
	
}
