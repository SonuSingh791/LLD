package strategyDesignPattern.kicks;

public class ShinKick implements IKickingBehaviour {

	@Override
	public void kick() {
		System.out.println("Hits with a shin kick");
	}
	
}
