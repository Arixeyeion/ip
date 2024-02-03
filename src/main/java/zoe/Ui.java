package zoe;

import java.util.ArrayList;
import java.util.List;
public class Ui {
    protected ArrayList<String> functions = new ArrayList<String>();
    public Ui() {
        functions.addAll(List.of("list", "mark", "unmark", "todo", "deadline", "event"));
    }
    public void saysHi() {
        System.out.println("Hello! I'm Zoe");
        System.out.println("What can I do for you?");
    }

    public void saysBye() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    public void todoDescription() {
        System.out.println("Sorry! todo requires a description like todo XYZ");
    }

    public void invalidCommand(){
        System.out.println("Sorry! I can't carry this out. I can only perform these currently: " + functions);
    }

    public void invalidIndex() {
        System.out.println("This task does not exist! " +
                "Input a positive number among tasks in list starting from 1");
    }

}