package observerDesignPattern;

// why Observer is an interface ?
// Because Observer doen't have meaning in itself, we can make different types of Observer implementing Observer interface and modify the update fun.
public interface Observor {
	void update(Subject s);
}