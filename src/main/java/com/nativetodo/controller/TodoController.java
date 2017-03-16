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
    public void createUser(@RequestBody Todo todo) {
        todoService.create(todo);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List listUser() {
        return todoService.getAllTodo();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Todo todo) {
        todoService.update(todo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        Todo todo = todoService.findTodoById(id);
        todoService.delete(todo);
    }
}
