package com.todolist.app.toDoList.Model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * This is the entity that represents a task with an ID, title and description.
 */
@Entity
@Table(schema = "tasksCrud")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private String description;


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
