package com.hendisantika.springdocapidemo2.controller;

import com.hendisantika.springdocapidemo2.model.Todo;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-api-demo2
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/03/22
 * Time: 10.10
 * To change this template use File | Settings | File Templates.
 */
@RestController
class TodoController implements TodoApi {

    private List<Todo> todos;

    @Override
    public List<Todo> findAll() {
        return todos;
    }

    @Override
    public Todo findById(String id) {
        return todos.stream().filter(todo -> todo.getId().equals(id)).findFirst().orElseGet(null);
    }

    @Override
    public Todo save(Todo todo) {
        todos.add(todo);
        return todo;
    }

    @Override
    public Todo update(String id, Todo todo) {
        for (Todo t : todos) {
            if (t.getId().equals(id)) {
                t.setText(todo.getText());
            }
        }

        return todo;
    }

    @Override
    public void delete(String id) {
        todos.removeIf(t -> t.getId().equals(id));
    }

    @PostConstruct
    public void onInit() {
        todos = Stream.of("Groceries", "Lisa's birthday")
                .map(todo -> new Todo(UUID.randomUUID().toString(), todo))
                .collect(Collectors.toList());
    }
}
