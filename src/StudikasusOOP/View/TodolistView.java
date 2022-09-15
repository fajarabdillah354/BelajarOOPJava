package src.StudikasusOOP.View;

import src.StudikasusOOP.Service.TodolistService;
import src.StudikasusOOP.Util.InputUtil;

public class TodolistView {



    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    public void showTodoList(){
        while (true){
            todolistService.showTodolist();
            System.out.println(" Menu : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("X. keluar");

            var input = InputUtil.inputUser("pilih");
            if(input.equals("1")){
                addTodolist();
            } else if (input.equals("2")){
                removeTodolist();
            } else if (input.equals("x")){
                break;
            }else {
                System.out.println("***** Pilihan tidak tersedia *****");
            }
        }
    }

    public void addTodolist(){
        System.out.println("Menambah TODO");
        var todo = InputUtil.inputUser("todo (pilih x jika batal)" );
        if (todo.equals("x")){//akan tetap menampilkan todolist yang telah ada
            //batal
        }else{
            todolistService.addTodolist(todo);
        }
    }

    public void removeTodolist(){

    }



}
