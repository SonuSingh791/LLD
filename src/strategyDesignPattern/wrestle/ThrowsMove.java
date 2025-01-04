package strategyDesignPattern.wrestle;

public class ThrowsMove implements IWrestlingBehaviour {

	@Override
	public void wrestle() {
		System.out.println("Hits with throws to ground");
	}
	
}