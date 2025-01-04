package strategyDesignPattern.PathFinder;

public class NavigationSystem {
	private Path path;
	public NavigationSystem(Path path) {
		this.path = path;
	}
	
	public void CalculatePath(String source, String destination) {
		path.CalculatePath(source, destination); // return a Route class in every strategy class
	}
	
}
