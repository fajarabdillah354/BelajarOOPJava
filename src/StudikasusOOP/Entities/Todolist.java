package src.StudikasusOOP.Entities;

public class Todolist {
    private String todo;

    public Todolist(){

    }

    public Todolist(String todo) {
        this.todo = todo;
    }


    /*
    Getter dan Setter
     */
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
