package strategyDesignPattern.wrestle;

public class ChokeMove implements IWrestlingBehaviour {

	@Override
	public void wrestle() {
		System.out.println("Hits with rear neck choke");
	}
	
}