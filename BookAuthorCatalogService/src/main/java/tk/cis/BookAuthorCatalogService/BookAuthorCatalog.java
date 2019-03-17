package tk.cis.BookAuthorCatalogService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import tk.cis.BookAuthorCatalogService.model.AuthorDetails;
import tk.cis.BookAuthorCatalogService.model.BookCatalogDetails;
import tk.cis.BookAuthorCatalogService.model.BookDetails;

@RestController
@RequestMapping("/bookauthorcatalog")
public class BookAuthorCatalog {

	@Autowired
	private RestTemplate template;
	
	@RequestMapping("book/{bookid}")
	public BookCatalogDetails getBookCatalog(@PathVariable("bookid") String bookid) {
		
		//First get BookInfo by id
		BookDetails book = template.getForObject("http://localhost:8080/BookInfo/"+bookid, BookDetails.class);
		BookCatalogDetails bookauthorcatalog = new BookCatalogDetails(book.getBookId(), book.getBookName(), book.getDetails(), book.getPrice());
		List<String> authorids = book.getAuthorIds();
		//Iterate over Author ids and get AuthorInfo
		List<AuthorDetails> authors = authorids.stream().map(authorid ->{
			return template.getForObject("http://localhost:8081/AuthorInfo/"+authorid, AuthorDetails.class);
		}).collect(Collectors.toList());
		//popualate bookauthcatalog
		bookauthorcatalog.setAuthorIds(authors);
		return bookauthorcatalog;
	}
}
