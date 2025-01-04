package visitorDesignPattern;

public class ExportToSVGVisitor implements Visitor {

	@Override
	public void visit(Circle cir) {
		// TODO Auto-generated method stub
		System.out.println("Export cirlce to SVG");
	}

	@Override
	public void visit(Triangle tri) {
		// TODO Auto-generated method stub
		System.out.println("Export triangle to SVG");
	}

	@Override
	public void visit(Rectangle rect) {
		// TODO Auto-generated method stub
		System.out.println("Export rectangle to SVG");
	}

}
