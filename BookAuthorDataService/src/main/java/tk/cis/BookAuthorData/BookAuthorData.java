package tk.cis.BookAuthorData;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.cis.BookAuthorData.model.BookDetails;
import tk.cis.BookAuthorData.repository.BooksRepository;

@RestController 
@RequestMapping("/bookauthordata")
public class BookAuthorData {
	
	@Autowired 
	public BooksRepository booksRepo;
	
	@PostMapping("/add")
	public String addBookDetails(@RequestBody BookDetails bookDetails){
		 booksRepo.save(bookDetails);
		return "Added book to collection "+ bookDetails.getBookId();
	}

	
}
