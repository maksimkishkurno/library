package com.springboot.library.service;

import com.springboot.library.product.BookEntity;
import com.springboot.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public List<BookEntity> findAll(){
        return repository.findAll();
    }
    public void save(BookEntity entity){
        repository.save(entity);
    }
    public BookEntity findById(Long id){
        return repository.findById(id).get();
    }
    public void delete(Long id){
        repository.deleteById(id);
    }
}
