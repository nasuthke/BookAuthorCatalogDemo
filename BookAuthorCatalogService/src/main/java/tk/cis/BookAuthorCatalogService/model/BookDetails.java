package tk.cis.BookAuthorCatalogService.model;

import java.util.ArrayList;
import java.util.List;

public class BookDetails {
	private String BookId;
	private String BookName;
	private String Details;
	private int Price;
	
	private List<String> AuthorIds = new ArrayList<String>();
	
	public BookDetails() {
		
	}
	
	
	public BookDetails(String bookId, String bookName, String details, int price) {
		super();
		BookId = bookId;
		BookName = bookName;
		Details = details;
		Price = price;
	}


	

	public void addAuthorIds(String authorId) {
		AuthorIds.add(authorId);
	}


	public String getBookId() {
		return BookId;
	}


	public void setBookId(String bookId) {
		BookId = bookId;
	}


	public String getBookName() {
		return BookName;
	}


	public void setBookName(String bookName) {
		BookName = bookName;
	}


	public String getDetails() {
		return Details;
	}


	public void setDetails(String details) {
		Details = details;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}


	public List<String> getAuthorIds() {
		return AuthorIds;
	}


	public void setAuthorIds(List<String> authorIds) {
		AuthorIds = authorIds;
	}
	
	

}
