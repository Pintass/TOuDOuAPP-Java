package modele;

public class ClientToDoList {
    public static void main(String[] args){
        ToDoList t = new ToDoList("liste 1 = dev");
        System.out.println(t.setTask("grossomodo", "grossomodo c'est un mot en réalité.", "1"));
        System.out.println(t.setTask("grossomodo", "c'est une autre desc là en vrai.", "1"));
        System.out.println(t.setTask("grossomodo2", "c'est une autre desc là en vrai.", "1"));
        System.out.println(t.setTask("grossomodo3", "c'est une autre desc là en vrai.", "1"));
        System.out.println(t.setTask("grossomodo8", "c'est une autre desc là en vrai.", "1"));
        System.out.println(t.getTitleTasks());
        System.out.println(t.toString());
        System.out.println(t.deleteTask("grossomodo2"));
        System.out.println(t.toString());
        System.out.println(t.getTaskInfo("grossomodo"));
        System.out.println(t.getTaskInfo("tâcheinexistante"));
    }
}
