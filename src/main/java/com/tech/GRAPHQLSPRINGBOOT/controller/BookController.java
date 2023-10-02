package com.tech.GRAPHQLSPRINGBOOT.controller;

import com.tech.GRAPHQLSPRINGBOOT.entity.Author;
import com.tech.GRAPHQLSPRINGBOOT.entity.Book;
import com.tech.GRAPHQLSPRINGBOOT.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @QueryMapping
    public Book bookById(@Argument String id) {
        return bookService.getById(id);
    }

    @MutationMapping
    public Book updateBook(@Argument String id, @Argument String name) {
        return bookService.updateBook(id, name);
    }
}
