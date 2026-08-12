package io.at.learn.graphql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.at.learn.graphql.entities.Book;
import io.at.learn.graphql.repositories.BookRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BookService {

	private final BookRepository bookRepository;
	
	public Book create(Book book) {
		return this.bookRepository.save(book);
	}
	
	public List<Book> getAllBooks() {
		return this.bookRepository.findAll();
	}
	
	public Book getBookById(Integer bookId) {
		return this.bookRepository.findById(bookId)
				.orElseThrow(() -> new RuntimeException("Book Not Found"));
	}
	
	
}
