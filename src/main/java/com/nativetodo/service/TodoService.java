package com.nativetodo.service;

import com.nativetodo.model.Todo;

import java.util.List;

public interface TodoService {

    void create(Todo todo);

    void delete(Todo todo);

    List getAllTodo();

    void update(Todo todo);

    Todo findTodoById(long id);
}
