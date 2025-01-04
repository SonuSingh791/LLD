package strategyDesignPattern.punches;

public class NoPunch implements IPunchingBehaviour {
	
	@Override
	public void punch() {
		System.out.println("Doesn't Punch");
	}
	
}