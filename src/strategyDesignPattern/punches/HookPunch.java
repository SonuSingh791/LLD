package strategyDesignPattern.punches;

public class HookPunch implements IPunchingBehaviour {
	
	@Override
	public void punch() {
		System.out.println("Hits with a jab");
	}
	
}