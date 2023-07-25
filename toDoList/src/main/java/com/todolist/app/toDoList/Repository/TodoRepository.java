package com.todolist.app.toDoList.Repository;

import com.todolist.app.toDoList.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
