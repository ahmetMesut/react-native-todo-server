package com.nativetodo.model;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity
public class Todo implements Serializable {

    private static final long serialVersionUID = 1914842698571907341L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(unique = true)
    private String todoName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }
}
