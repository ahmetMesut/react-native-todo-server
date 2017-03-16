package com.nativetodo.dao;

import com.nativetodo.model.Todo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoDaoImpl implements TodoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(Todo todo) {
        sessionFactory.getCurrentSession().save(todo);
    }

    @Override
    public void delete(Todo todo) {
        sessionFactory.getCurrentSession().delete(todo);
    }

    @Override
    public List getAllTodo() {
        return sessionFactory.getCurrentSession().createCriteria(TodoDao.class).list();
    }

    @Override
    public void update(Todo todo) {
        sessionFactory.getCurrentSession().update(todo);
    }

    @Override
    public Todo findTodoById(long id) {
        return (Todo) sessionFactory.getCurrentSession().get(Todo.class, id);
    }
}
