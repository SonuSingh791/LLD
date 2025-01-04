package observerDesignPattern.Auction;

public class Bidder implements Observer {
	private String emailId;
	
	Bidder(String emailId) {
		this.emailId = emailId;
	}
	
	public void update(double price) {
		sendNotification(this.emailId, price);
	}
	
	void sendNotification(String emailId, double price) {
		System.out.println(emailId + "Current highest bid is: " + price);
	}
	
}
