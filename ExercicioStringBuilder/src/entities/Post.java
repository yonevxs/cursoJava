package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // constante - private static - permite que não tenhamos uma copia para cada instancia
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comment> getComments(){
		return comments;
	}
	
	// Coleções (List, ArrayList etc) não fazem o método set, faz add e remove
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	// Vamos usar StringBuilder para otimização de Strings grandes a partir de várias Strings pequenas
	public String toString() {
		StringBuilder sb = new StringBuilder(); // sb permite concatenar outras strings usando a função append
		sb.append(title + "\n"); // append - acrescenta no final
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for(Comment c : comments) {
			sb.append(c.getComment() + "\n");
		}
		return sb.toString(); // Converte o StringBuilder para String
	}
}
