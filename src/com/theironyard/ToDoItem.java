package com.theironyard;

/**
 * Created by austinhays on 5/23/16.
 */
public class ToDoItem {
    String text;
    boolean isDone;
    int id;

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    public ToDoItem(String text, boolean isDone, int id) {
        this.text = text;
        this.isDone = isDone;
        this.id = id;
    }
}
