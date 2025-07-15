package com.example.SpringbootBasics.Services;

import com.example.SpringbootBasics.Model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> todos = new ArrayList<>(
            Arrays.asList(
                    new Todo(1, "Buy Groceries", "Milk, Bread, Eggs"),
                    new Todo(2, "Study", "Spring Boot practice")
            )
    );

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo getTodoById(int id) {
        return todos.stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Todo not found with id: " + id));
    }

    public String addTodo(Todo todo) {
        todos.add(todo);
        return "Todo added: " + todo.getTitle();
    }

    public String updateTodo(int id, Todo updatedTodo) {
        for (Todo t : todos) {
            if (t.getId() == id) {
                t.setTitle(updatedTodo.getTitle());
                t.setDescription(updatedTodo.getDescription());
                return "Todo updated: " + updatedTodo.getTitle();
            }
        }
        return "Todo not found with id: " + id;
    }

    public String deleteTodoById(int id) {
        boolean removed = todos.removeIf(t -> t.getId() == id);
        return removed ? "Todo deleted with id: " + id : "Todo not found with id: " + id;
    }
}
