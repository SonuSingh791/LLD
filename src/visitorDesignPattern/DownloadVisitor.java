package visitorDesignPattern;

public class DownloadVisitor implements Visitor {

	@Override
	public void visit(Circle cir) {
		System.out.println("Download the circle");
		
	}

	@Override
	public void visit(Triangle tri) {
		System.out.println("Download the triangle");
		
	}

	@Override
	public void visit(Rectangle rec) {
		System.out.println("Download the rectangle");
		
	}
	
}
