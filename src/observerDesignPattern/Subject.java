package observerDesignPattern;
import java.util.*;

// why Subject is abstract class.?
// because Subject class doen't have meaning in itself, we can make different types of data like cricketData, electionData, stocksData by extending Subject class.

public abstract class Subject {
	// Subject class contains list of observers, register fun, unRegister, fun and notifyAllObserver fun
	private List<Observor> observors;
	
	public Subject() {
		this.observors = new ArrayList<Observor>();
	}
	
	public void register(Observor o) {
		observors.add(o);
	}
	
	public void unRegister(Observor o) {
		observors.remove(o);
	}
	
	public void notifyObservors() {
		for(Observor o: observors) {
			o.update(this);
		}
	}
}
