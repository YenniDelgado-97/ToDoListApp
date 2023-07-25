package com.todolist.app.toDoList.Controller;

import com.todolist.app.toDoList.Model.Task;
import com.todolist.app.toDoList.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Represents a REST controller for managing Todo tasks.
 */
@RestController
public class TodoController {

    /**
     * Autowired TodoRepository for accessing and manipulating Todo tasks.
     */
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping(value = "/")
    public String helloWorld(){
        return "HELLO WORLD!";
    }


    /**
     * Retrieves all tasks from the TodoRepository.
     *
     * @return A list of Task objects representing all the tasks.
     */
    @GetMapping(value = "/tasks")
    public List <Task> getTasks(){
        return todoRepository.findAll();
    }

    /**
     * Saves a new task to the TodoRepository.
     *
     * @param task The Task object to be saved.
     * @return A string indicating that the task has been saved.
     */
    @PostMapping(value = "/savetask")
    public String saveTask(@RequestBody Task task){
        todoRepository.save(task);
        return "Save task";
    }

    /**
     * Updates an existing task in the TodoRepository.
     *
     * @param id   The ID of the task to be updated.
     * @param task The Task object containing the updated information.
     * @return A string indicating that the task has been updated.
     */
    @PutMapping(value = "/update/{id}")
    public String updateTask(@PathVariable long id,@RequestBody Task task) {
        Task updatedTask = todoRepository.findById(id).get();
        updatedTask.setTitle(task.getTitle());
        updatedTask.setDescription(task.getDescription());
        todoRepository.save(updatedTask);
        return "Updated Task";

    }


    /**
     * Deletes a task from the TodoRepository.
     *
     * @param id The ID of the task to be deleted.
     * @return A string indicating that the task has been deleted.
     */
    @DeleteMapping(value = "/delete/{id}")
    public String deleteTask(@PathVariable long id){
        Task deletedTask = todoRepository.findById(id).get();
        todoRepository.delete(deletedTask);
        return "deleted task";
    }







}
