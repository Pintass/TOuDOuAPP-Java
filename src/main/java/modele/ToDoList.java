package modele;

import java.util.ArrayList;
import java.util.HashMap;

public class ToDoList {
    private final HashMap<String, ArrayList<String>> chSetTodo;
    private final String chTitleList;

    public ToDoList(String parTitleList) {
        chSetTodo = new HashMap<>();
        chTitleList = parTitleList;
    }

    /**
     *
     * @param parTaskTitle permet de donner une clé ainsi qu'un nom sur une tâche, c'est aussi le moyen d'identification d'une tâche..
     * @param parTaskDescription sert à décrire une tâche.
     * @param priorityDegree permet d'établir un degré de priorité, il s'agit d'un chiffre entre 1 et 3.
     * @return True si la tâche a bien été ajoutée, False si elle est déjà présente dans la todolist.
     */
    public boolean setTask(String parTaskTitle, String parTaskDescription, String priorityDegree){
        ArrayList tempList = new ArrayList<String>();
        tempList.add(priorityDegree); tempList.add(parTaskDescription);
        if(!chSetTodo.containsKey(parTaskTitle)) {
            chSetTodo.put(parTaskTitle, tempList);
            return true;
        } else return false;
    }

    /**
     * permet de récupérer le nom de la todolist
     * @return le titre de la todolist actuelle
     */
    public String getTitle(){
        return chTitleList;
    }

    /**
     * Permet de récupérer tous les titres des différentes tâches dela todolist
     * @return une liste de tous les titres
     */
    public String getTitleTasks(){
        return chSetTodo.keySet().toString();
    }

    /**
     * Il y a plusieurs informations dans la liste d'une tâche : sa description ainsi que son degré de priorité.
     * @param taskName est le nom/clé de la tâche voulue
     * @return
     */
    public ArrayList<String> getTaskInfo(String taskName){
        return chSetTodo.get(taskName);
    }


    /**
     * deleteTask permet d'enlever une tâche de la todolist pour différentes raisons : tâche accomplie ou tâche à retirer
     * @param taskName est le nom/clé de la tâche voulue
     * @return
     */
    public boolean deleteTask(String taskName) {
        if (chSetTodo.containsKey(taskName)) {
            chSetTodo.remove(taskName);
            if (!chSetTodo.containsKey(taskName)) return true;
        }
        return false;
    }



}
