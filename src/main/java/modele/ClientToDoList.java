package modele;

public class ClientToDoList {
    public static void main(String[] args){
        ToDoList t = new ToDoList("liste 1 = dev");
        System.out.println(t.setTask("grossomodo", "grossomodo c'est un mot en réalité.", "1"));
        System.out.println(t.setTask("grossomodo", "c'est une autre desc là en vrai.", "1"));
        System.out.println(t.getTitleTasks());
    }
}
