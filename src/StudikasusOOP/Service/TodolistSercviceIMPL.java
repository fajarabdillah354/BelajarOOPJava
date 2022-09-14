package src.StudikasusOOP.Service;

import src.StudikasusOOP.Entities.Todolist;
import src.StudikasusOOP.Repository.TodolistRepository;
import src.StudikasusOOP.Repository.TodolistRepositoryImpl;

public class TodolistSercviceIMPL implements TodolistService {


    private TodolistRepository todolistRepository;

    public TodolistSercviceIMPL(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodolist() {
        System.out.println("======TODOLIST========");
        Todolist[] model = todolistRepository.getAll();
        for(var i = 0;i < model.length;i++ ){
            var todolist = model[i];
            var no = i +1;
            if(todolist != null){
                System.out.println(no + ". " +todolist.getTodo());

            }
        }
    }

    @Override
    public void addTodolist(String todo) {
        Todolist todolist = new Todolist(todo);
        todolistRepository.add(todolist);
        System.out.println("sukses menambah "+todo);
    }

    @Override
    public void removeTodolist(Integer number) {
        boolean sukses = todolistRepository.remove(number);
        if (sukses){
            System.out.println("sukses menghapus todo : "+number);
        }else {
            System.out.println("gagal menghapus todo : "+number);
        }
    }
}
