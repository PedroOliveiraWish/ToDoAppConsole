package todoappconsole;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * This class define the operations that will run in console
 *
 * @author Pedro Henrique Oliveira
 * @version 1.0
 */

public class ControllerToDo {
    private ArrayList<ToDo> listToDo = new ArrayList<>();
    private int id = 1;

    /**
     * Return the list that contains all tasks
     *
     * @return listToDo
     */
    public ArrayList<ToDo> getListToDo() {
        return listToDo;
    }

    /**
     * Method for create a task of the ToDo and add its for the list;
     *
     * @param title The title of the task
     * @param message The message of the task
     * @param done The status of the ToDo
     */
    public void createToDo(String title, String message, boolean done) {
        ToDo newToDo = new ToDo(id++, title, message, done);

        listToDo.add(newToDo);

        System.out.println("Item created successfully!");
    }

    /**
     * Method that allow user to mark the task as done by its id
     *
     * @param id Identification of the task
     */
    public void markAsDone(int id) {
        if (listToDo.isEmpty()) {
            System.out.println("Please, add an item toDo. The list is empty");
            return;
        }

        for (ToDo toDo : listToDo) {
            if (toDo.getId() == id) {
                toDo.setDone(true);

                System.out.println("Item ToDo marked as done!");
                return;
            }
        }

        System.out.println("There is not item ToDo with this id!");
    }

    /**
     * Method that allow the user to delete a task by its id
     *
     * @param id Identification of the task
     */
    public void deleteToDo(int id) {
        if (listToDo.isEmpty()) {
            System.out.println("Please, add an item toDo. The list is empty");
            return;
        }

        for (ToDo toDo : listToDo) {
            if (toDo.getId() == id) {
                listToDo.remove(toDo);

                System.out.println("ToDo item removed from the list");
                return;
            }

        }
        System.out.println("There is not toDo item with this id!");
    }

    /**
     * Method that allow the user to save all the tasks in a file.txt
     *
     * @param filename The filename of the file
     */
    public void saveAsText(String filename) {
        if (listToDo.isEmpty()) {
            System.out.println("It cannot possible to save because the list is empty!");
            return;
        }

        String userHome = System.getProperty("user.home");
        String downloadPath = userHome + File.separator + "Downloads" + File.separator + filename;

        try (PrintWriter writer = new PrintWriter(new FileWriter(downloadPath))) {
            for (ToDo toDo : listToDo) {
                writer.println("----- ToDo Item -----");
                writer.println("ID: " + toDo.getId());
                writer.println("Title: " + toDo.getTitle());
                writer.println("Message: " + toDo.getMessage());
                writer.println("Done: " + toDo.getDone());
                writer.println("---------------------");
            }

            System.out.println("ToDo list saved as: " + downloadPath);
        } catch (IOException e) {
            System.out.println("Error for saving list: " + e.getMessage());
        }
    }
}
