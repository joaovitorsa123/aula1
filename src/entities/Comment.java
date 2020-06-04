package entities;

public class Comment {
	
	private String text;
	
	public Comment() {
		
	}
	
	public Comment(String text) {
		super();
		this.text = text;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	

}
