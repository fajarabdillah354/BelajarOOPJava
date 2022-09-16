package src.TodolistV2;

import src.StudikasusOOP.Repository.TodolistRepository;
import src.StudikasusOOP.Repository.TodolistRepositoryImpl;
import src.StudikasusOOP.Service.TodolistSercviceIMPL;
import src.StudikasusOOP.Service.TodolistService;
import src.StudikasusOOP.View.TodolistView;

public class TodolistVersi2 {

  public static void main(String[] args) {
    TodolistRepository todolistRepository = new TodolistRepositoryImpl();
    TodolistService todolistService = new TodolistSercviceIMPL(todolistRepository);
    TodolistView todolistView = new TodolistView(todolistService);

    todolistView.showTodoList();
  }



}
