package visitorDesignPattern;

public class DrawBoarderVisitor implements Visitor {

	@Override
	public void visit(Circle cir) {
		// TODO Auto-generated method stub
		System.out.println("Draw a boarder to circle");
	}

	@Override
	public void visit(Triangle tri) {
		// TODO Auto-generated method stub
		System.out.println("Draw a boarder to triangle");
	}

	@Override
	public void visit(Rectangle rect) {
		// TODO Auto-generated method stub
		System.out.println("Draw a boarder to rectangle");
	}

}
