package decoratorDesignPattern.TextFormattingSystem;

public class UnderlineText extends TextDecorator{

	UnderlineText(Text text) {
		super(text);
		// TODO Auto-generated constructor stub
	}
	
	public String formate() {
		return "<u>" + super.formate() + "</u>";
	}

}
