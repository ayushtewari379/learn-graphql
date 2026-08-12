package io.at.learn.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.at.learn.graphql.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
