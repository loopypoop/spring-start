package com.example.demo.service;

import com.example.demo.model.Author;

public interface IAuthorService {
    Author create(Author author);
    Author getById(Integer id);
}