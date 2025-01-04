package decoratorDesignPattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape cir = new Circle();
		ShapeDecorator cirWithBorder = new BorderShapeDecorator(cir);
		cirWithBorder.draw();
		
		ColorShapeDecorator cirWithBorderAndColor = new ColorShapeDecorator(cirWithBorder);
		cirWithBorderAndColor.draw();
		
		ShapeDecorator cirWithDoubleBorder = new BorderShapeDecorator(cirWithBorder);
		cirWithDoubleBorder.draw();
	}

}
