package strategyDesignPattern.kicks;

public class RoundHouseKick implements IKickingBehaviour {

	@Override
	public void kick() {
		System.out.println("Hits with a round-house kick");
	}
	
}
