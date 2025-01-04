package decoratorDesignPattern.TextFormattingSystem;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlainText plainText = new PlainText();
		BoldText boldText = new BoldText(plainText);
		ItalicText italicText = new ItalicText(boldText);
		
		System.out.println(italicText.formate());
		
	}

}
