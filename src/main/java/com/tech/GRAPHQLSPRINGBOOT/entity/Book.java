package com.tech.GRAPHQLSPRINGBOOT.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String id;
    private String name;
    private Author author;
}
