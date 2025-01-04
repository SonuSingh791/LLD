package decoratorDesignPattern.TextFormattingSystem;

public abstract class TextDecorator implements Text {
	Text text;
	TextDecorator(Text text) {
		this.text = text;
	}
	@Override
	public String formate() {
		// TODO Auto-generated method stub
		return text.formate();
	}
	
	
}
