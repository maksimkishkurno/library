package com.springboot.library.mappers;

import com.springboot.library.dto.BookDto;
import com.springboot.library.product.BookEntity;

public class BeanMapper {
    public BookDto toDto(BookEntity entity){
        BookDto dto = new BookDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAuthor(entity.getAuthor());
        dto.setIsbn(entity.getIsbn());
        dto.setPrice(entity.getPrice());
        return dto;
    }
    public BookEntity entity(BookDto dto){
        return new BookEntity(dto.getId(), dto.getName(), dto.getAuthor(),dto.getIsbn(), dto.getPrice());
    }
}
