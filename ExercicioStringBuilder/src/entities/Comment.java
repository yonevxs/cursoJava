package entities;

public class Comment {
	private String text;
	
	public Comment() {		
	}
	public Comment(String text){
		this.text = text;
	}
	
	public String getComment() {
		return text;
	}
	public void setComment(String text) {
		this.text = text;
	}
}
