package decoratorDesignPattern.TextFormattingSystem;

public class ItalicText extends TextDecorator{

	ItalicText(Text text) {
		super(text);
		// TODO Auto-generated constructor stub
	}
	
	public String formate() {
		return "<i>" + super.formate() + "</i>";
	}

}
