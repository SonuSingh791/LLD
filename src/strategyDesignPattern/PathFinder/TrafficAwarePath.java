package strategyDesignPattern.PathFinder;

public class TrafficAwarePath implements Path{
	public void CalculatePath(String source, String destination) {
		System.out.println("Shortest Path between A & B is A -> C -> B");
	}
}
