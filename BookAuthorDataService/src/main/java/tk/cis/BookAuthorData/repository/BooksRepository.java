package tk.cis.BookAuthorData.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tk.cis.BookAuthorData.model.BookDetails;

public interface BooksRepository extends MongoRepository<BookDetails, String> {

}
