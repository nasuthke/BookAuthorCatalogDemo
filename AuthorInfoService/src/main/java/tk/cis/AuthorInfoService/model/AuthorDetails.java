package tk.cis.AuthorInfoService.model;

import java.util.ArrayList;
import java.util.List;

public class AuthorDetails {
	private String AuthorId;
	private String AuthorName;
	private String Details;
	private List<String> BookIds = new ArrayList<String>();
	
	public AuthorDetails() {
		
	}
	
	
	public AuthorDetails(String authorId, String authorName, String details) {
		super();
		AuthorId = authorId;
		AuthorName = authorName;
		Details = details;
	}


	public String getAuthorId() {
		return AuthorId;
	}
	public void setAuthorId(String authorId) {
		AuthorId = authorId;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}

	public void addBookIds(String bookId) {
		BookIds.add(bookId);
	}


	public List<String> getBookIds() {
		return BookIds;
	}


	public void setBookIds(List<String> bookIds) {
		BookIds = bookIds;
	}
	
	

}
