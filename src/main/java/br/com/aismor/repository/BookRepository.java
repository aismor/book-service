package br.com.aismor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aismor.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
