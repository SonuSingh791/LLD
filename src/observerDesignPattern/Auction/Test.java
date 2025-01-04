package observerDesignPattern.Auction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bidder bidder1 = new Bidder("xyz@gmail.com");
		Bidder bidder2 = new Bidder("abc@gmail.com");
		Bidder bidder3 = new Bidder("pqr@gmail.com");
		
		Auction auction = new Auction();
		auction.addObserver(bidder1);
		auction.addObserver(bidder2);
		auction.addObserver(bidder3);
		
		auction.setPrice(10);
		
	}

}
