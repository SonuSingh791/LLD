package strategyDesignPattern.punches;

public class JabPunch implements IPunchingBehaviour {
	
	@Override
	public void punch() {
		System.out.println("Hits with a jab");
	}
	
}