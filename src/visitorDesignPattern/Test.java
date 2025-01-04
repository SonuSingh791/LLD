package visitorDesignPattern;

import java.util.ArrayList;
import java.util.List;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape cir = new Circle();
		Shape tri = new Triangle();
		Shape rect = new Rectangle();
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(cir);
		shapes.add(tri);
		shapes.add(rect);
		
		Visitor exportToSVG = new ExportToSVGVisitor();
		Visitor drawBoarder = new DrawBoarderVisitor();
		// in that way by making visitor we can add more functionality.
		
		for(Shape sh: shapes) {
			sh.draw();
			sh.accept(exportToSVG);
			sh.accept(drawBoarder);
		}
	}

}
