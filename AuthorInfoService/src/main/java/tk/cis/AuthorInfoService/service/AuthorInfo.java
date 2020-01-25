package tk.cis.AuthorInfoService.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.cis.AuthorInfoService.model.AuthorDetails;



@RestController
@RequestMapping("/AuthorInfo")

public class AuthorInfo {
	private List<AuthorDetails> authors = new ArrayList<AuthorDetails>();
	
	private static final Logger log = LoggerFactory.getLogger(AuthorInfo.class);

	public AuthorInfo() {
		AuthorDetails Author1 = new AuthorDetails("1", "Author1", "Author Details 1");
		Author1.addBookIds("1");
		Author1.addBookIds("2");
		authors.add(Author1);
		
		AuthorDetails Author2 = new AuthorDetails("2", "Author2", "Author Details 2");
		Author2.addBookIds("2");
		Author2.addBookIds("3");
		authors.add(Author2);
		
		AuthorDetails Author3 = new AuthorDetails("3", "Author3", "Author Details 3");
		Author3.addBookIds("1");
		Author3.addBookIds("3");
		authors.add(Author3);
	}
	
	@RequestMapping("/{authorname}")
	public AuthorDetails getAuthInfo(@PathVariable("authorname") String authorname){
		log.debug("inside getAuthInfo() with path var "+ authorname);
		return authors.get(0);
	}
	
	@RequestMapping("/")
	public List<AuthorDetails> getAllAuthors(){
		log.debug("inside getAllAuthors() ");
		return authors;
	}

}
