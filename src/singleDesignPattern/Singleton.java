package singleDesignPattern;

// we can't make 2 object of singleton class
public class Singleton {
	private static Singleton inst;
	
	private Singleton() {	// we can't make object from outside of these class because constructor is private.
	}
	
	public static Singleton getTheSingleInstance() {	// make a static method which can be called via class name
		if(inst == null) {
			synchronized (Singleton.class) { // this make sure that if any thread enters in this block then it will acquire lock until it executed this block.
				if(inst == null) {	// this make sure that only one object will be created. if an object is already created mean inst != null then it will not make obj.
					inst = new Singleton();
				}
			}
		}
		
		return inst;
	}
}
