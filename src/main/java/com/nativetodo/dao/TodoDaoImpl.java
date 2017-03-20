package com.nativetodo.dao;

import com.nativetodo.model.Todo;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TodoDaoImpl implements TodoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(Todo todo) {
        sessionFactory.getCurrentSession().save(todo);
    }

    @Override
    public void delete(Todo todo) {
        Criteria criteria =sessionFactory.getCurrentSession().createCriteria(Todo.class);
        criteria.add(Restrictions.eq("id", todo.getId()));
        Todo todo1 = (Todo) criteria.uniqueResult();
        sessionFactory.getCurrentSession().delete(todo1);
    }

    @Override
    public List getAllTodo() {
        return sessionFactory.getCurrentSession().createCriteria(Todo.class).list();
    }

    @Override
    public void update(Todo todo) {
        sessionFactory.getCurrentSession().update(todo);
    }

}
