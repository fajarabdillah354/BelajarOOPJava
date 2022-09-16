package src.StudikasusOOP.test.service;

import src.StudikasusOOP.Entities.Todolist;
import src.StudikasusOOP.Repository.TodolistRepository;
import src.StudikasusOOP.Repository.TodolistRepositoryImpl;
import src.StudikasusOOP.Service.TodolistSercviceIMPL;
import src.StudikasusOOP.Service.TodolistService;

public class TodolistServiceTest {
    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist(){
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        todolistRepository.data[0] = new Todolist("belajar java dasar");
        todolistRepository.data[1] = new Todolist("belajar java oop");
        todolistRepository.data[2] = new Todolist("belajar java standartclasses");



        TodolistService todolistService = new TodolistSercviceIMPL(todolistRepository);
        todolistService.showTodolist();
    }

    public static void testAddTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistSercviceIMPL(todolistRepository);
        todolistService.addTodolist("belajar masak");
        todolistService.addTodolist("belajar berenang");
        todolistService.addTodolist("belajar Matematika");

        todolistService.showTodolist();
    }


    public static void testRemoveTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistSercviceIMPL(todolistRepository);

        todolistService.addTodolist("belajar masak");
        todolistService.addTodolist("belajar berenang");
        todolistService.addTodolist("belajar Matematika");

        todolistService.showTodolist();
        todolistService.removeTodolist(6);
        todolistService.removeTodolist(2);
        todolistService.showTodolist();
    }



}
