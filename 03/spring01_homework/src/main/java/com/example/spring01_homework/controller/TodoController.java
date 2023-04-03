package com.example.spring01_homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoController {

    private static ArrayList<String> todolist = new ArrayList<>();

    @GetMapping("/list")
    public ArrayList<String> mainPage() {
        return todolist;
    }

    @GetMapping("/receiveList")
    public ArrayList<String> receiveList(String todo) {

        boolean isDuplicated = false;

        for (int i = 0; i < todolist.size(); i++) {
            if (todolist.get(i).equals(todo)) {
                isDuplicated = true;
            }
        }

        if (!isDuplicated) {
            todolist.add(todo);
            return todolist;
        }
        return todolist;
    }

    @GetMapping("/deleteList")
    public ArrayList<String> deleteList(int todo){

        todolist.remove(todo);
        return todolist;
    }

    //@GetMapping("update")
    static class Todo{
        private String todo;

        public String getTodo(){
            return todo;
        }

        public void setTodo(String todo){
            this.todo = todo;
        }
    }

}