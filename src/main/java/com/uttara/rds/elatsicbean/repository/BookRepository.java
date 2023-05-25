package com.uttara.rds.elatsicbean.repository;


import com.uttara.rds.elatsicbean.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
