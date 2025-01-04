package strategyDesignPattern.punches;

public class UpperCutPunch implements IPunchingBehaviour {
	
	@Override
	public void punch() {
		System.out.println("Hits with uppercut");
	}
	
}