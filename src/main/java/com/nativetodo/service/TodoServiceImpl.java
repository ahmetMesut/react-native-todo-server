package com.nativetodo.service;


import com.nativetodo.dao.TodoDao;
import com.nativetodo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoDao todoDao;

    @Override
    public void create(Todo todo) {
        todoDao.create(todo);
    }

    @Override
    public void delete(Todo todo) {
        todoDao.delete(todo);
    }

    @Override
    public List getAllTodo() {
        return todoDao.getAllTodo();
    }

    @Override
    public void update(Todo todo) {
        todoDao.update(todo);
    }

    @Override
    public Todo findTodoById(long id) {
        return todoDao.findTodoById(id);
    }
}
