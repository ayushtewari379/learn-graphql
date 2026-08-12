package io.at.learn.graphql.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	private String author;
	private double price;
	private int pages;

	public Book(BookInput bookInput) {
		this.title = bookInput.getTitle();
		this.author = bookInput.getAuthor();
		this.price = bookInput.getPrice();
		this.pages = bookInput.getPages();
	}

}
