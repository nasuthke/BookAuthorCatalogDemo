package tk.cis.BookInfoService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.cis.BookInfoService.model.BookDetails;


@RestController
@RequestMapping("/BookInfo")

public class BookInfo {
	private List<BookDetails> books = new ArrayList<BookDetails>();
	
	public BookInfo() {
		BookDetails Author1 = new BookDetails("1", "Book1", "Book Details 1");
		Author1.addAuthorIds("1");
		Author1.addAuthorIds("2");
		books.add(Author1);
		
		BookDetails Author2 = new BookDetails("2", "Book2", "Book Details 2");
		Author2.addAuthorIds("2");
		Author2.addAuthorIds("3");
		books.add(Author2);
		
		BookDetails Author3 = new BookDetails("3", "Book3", "Book Details 3");
		Author3.addAuthorIds("1");
		Author3.addAuthorIds("3");
		books.add(Author3);
	}
	
	@RequestMapping("/{authorname}")
	public BookDetails getAuthInfo(@PathVariable("authorname") String authorname){
		return books.get(0);
	}
	
	@RequestMapping("/")
	public List<BookDetails> getAllAuthors(){
		return books;
	}

}
