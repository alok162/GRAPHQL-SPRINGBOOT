package com.tech.GRAPHQLSPRINGBOOT.service;

import com.tech.GRAPHQLSPRINGBOOT.entity.Author;
import com.tech.GRAPHQLSPRINGBOOT.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private static List<Book> books;

    static {
        Book book1 = new Book("1", "GraphQL Overview", new Author("1", "Alok1", "Choudhary1"));
        Book book2 = new Book("2", "Spring Overview", new Author("2", "Alok2", "Choudhary2"));
        books = List.of(book1, book2);
    }

    public List<Book> allBooks() {
        return books;
    }

    public Book getById(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public Book updateBook(String id, String name) {
        Book book = getById(id);
        if (book != null) {
            book.setName(name);
        }
        return book;
    }
}
