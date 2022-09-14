package src.StudikasusOOP.test.View;

import src.StudikasusOOP.Repository.TodolistRepository;
import src.StudikasusOOP.Repository.TodolistRepositoryImpl;
import src.StudikasusOOP.Service.TodolistSercviceIMPL;
import src.StudikasusOOP.Service.TodolistService;
import src.StudikasusOOP.View.TodolistView;

public class TodolistViewTest {

  public static void main(String[] args) {
    testShowTodoList();

  }

  public static void testShowTodoList(){
    TodolistRepository todolistRepository = new TodolistRepositoryImpl();
    TodolistService todolistService = new TodolistSercviceIMPL(todolistRepository);
    TodolistView todolistView = new TodolistView(todolistService);

    todolistService.addTodolist("belajar masak");
    todolistService.addTodolist("belajar berenang");
    todolistService.addTodolist("belajar memancing");

    todolistView.showTodoList();
  }

}
