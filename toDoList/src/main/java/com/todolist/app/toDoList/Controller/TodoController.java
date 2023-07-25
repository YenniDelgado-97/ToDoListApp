package com.todolist.app.toDoList.Controller;

import com.todolist.app.toDoList.Model.Task;
import com.todolist.app.toDoList.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping(value = "/")
    public String helloWorld(){
        return "HELLO WORLD!";
    }

    @GetMapping(value = "/tasks")
    public List <Task> getTasks(){
        return todoRepository.findAll();
    }


}
