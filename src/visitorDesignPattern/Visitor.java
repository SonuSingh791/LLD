package visitorDesignPattern;

public interface Visitor {
	void visit(Circle cir);
	void visit(Triangle tri);
	void visit(Rectangle rect);
}
