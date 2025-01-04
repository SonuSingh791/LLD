package strategyDesignPattern.kicks;

public class FootStomp implements IKickingBehaviour {

	@Override
	public void kick() {
		System.out.println("Hits with a foot stomp");
	}
	
}
