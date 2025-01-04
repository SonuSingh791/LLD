package decoratorDesignPattern.TextFormattingSystem;

public class BoldText extends TextDecorator{

	BoldText(Text text) {
		super(text);
		// TODO Auto-generated constructor stub
	}
	
	public String formate() {
		return "<b>" + super.formate() + "</b>";
	}

}
