package com.tech.GRAPHQLSPRINGBOOT.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Author {
    private String  id;
    private String firstName;
    private String lastName;
}
