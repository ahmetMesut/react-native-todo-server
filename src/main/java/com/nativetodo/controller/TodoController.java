package com.nativetodo.controller;


import com.nativetodo.model.Todo;
import com.nativetodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "todo", consumes = "application/json", produces = "application/json")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping(method = RequestMethod.POST)
    public Todo createUser(@RequestBody Todo todo) {
        todoService.create(todo);
        return todo;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List listUser() {
        return todoService.getAllTodo();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Todo update(@RequestBody Todo todo) {
        todoService.update(todo);
        return todo;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody Todo todo) {
        todoService.delete(todo);
    }
}
