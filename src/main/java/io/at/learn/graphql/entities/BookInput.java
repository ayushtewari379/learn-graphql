package io.at.learn.graphql.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookInput {
	private String title;
	private String author;
	private double price;
	private int pages;
}
