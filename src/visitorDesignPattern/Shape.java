package visitorDesignPattern;

// suppose we have different shapes like circle, rectangle and triangle. These shapes implements shape and implement the draw fun. After that
// we ship the code to live. after that we need to add some more functionality, bcs code is live it's not good thing to change the code and it voilates 
// the 'O' principle.

// to solve this problem will make visitor which visits all the shape and apply the functionality.
public interface Shape {
	void draw();
	void accept(Visitor vis); // it accepts a visitor and pass the shape to visit. 
}
