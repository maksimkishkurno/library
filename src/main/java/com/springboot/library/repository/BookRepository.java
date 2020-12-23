package com.springboot.library.repository;

import com.springboot.library.product.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
