package io.at.learn.graphql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import io.at.learn.graphql.entities.Book;
import io.at.learn.graphql.entities.BookInput;
import io.at.learn.graphql.services.BookService;
import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BookController {
	
	private final BookService bookService;
	
	@MutationMapping("createBook")
	public Book createBook(@Argument BookInput bookInput) {
		Book book = new Book(bookInput);
		return this.bookService.create(book);
	}
	
	@QueryMapping("allBooks")
	public List<Book> findAll() {
		return this.bookService.getAllBooks();
	}
	
	@QueryMapping("getBook")
	public Book createBook(@Argument Integer bookId) {
		return this.bookService.getBookById(bookId);
	}

}
