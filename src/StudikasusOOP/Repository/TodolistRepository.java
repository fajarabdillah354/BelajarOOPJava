package src.StudikasusOOP.Repository;

import src.StudikasusOOP.Entities.Todolist;

public interface TodolistRepository {
   Todolist[] getAll();

   void add(Todolist todolist);

   boolean remove(Integer number);

}
