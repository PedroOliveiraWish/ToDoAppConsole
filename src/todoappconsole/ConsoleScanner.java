package todoappconsole;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that define the methods for the scanner and the interation of the user
 *
 * @author Pedro Henrique Oliveira
 * @version 1.0
 */

public class ConsoleScanner {
    Scanner scanner = new Scanner(System.in);
    ControllerToDo controller = new ControllerToDo();

    /**
     * A method that contains all the iteration of the user will have to your List and tasks
     */
    public void initiateConsole() {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Choose an option: ");
            System.out.println("List all ToDo: 1");
            System.out.println("Create an item ToDo: 2");
            System.out.println("Mark an item as done: 3");
            System.out.println("Delete an item toDo: 4");
            System.out.println("Save the list as txt: 5");
            System.out.println("Close the ToDo: 6");

            int optionChose = scanner.nextInt();
            scanner.nextLine();

            switch (optionChose) {
                case 1:
                    System.out.println("Here is all your item: ");
                    ArrayList<ToDo> listToDo = controller.getListToDo();

                    if (listToDo.isEmpty()) {
                        System.out.println("The list is empty. Create an item before!");
                        break;
                    }

                    for (ToDo toDo : listToDo) {
                        System.out.printf(
                                "--- ToDo Item ---\n" +
                                        "id: %s\n" +
                                        "Title: %s\n" +
                                        "Message: %s\n" +
                                        "Done: %b\n" +
                                        "-----------------%n",
                                toDo.getId(),toDo.getTitle(), toDo.getMessage(), toDo.getDone()
                        );
                    }
                    break;

                case 2:
                    System.out.println("Write the title of the item: ");
                    String title = scanner.nextLine();
                    System.out.println("Type your todo item: ");
                    String message = scanner.nextLine();
                    System.out.println("Type if your item is done or no: (true / false) ");
                    boolean done = Boolean.parseBoolean(scanner.nextLine());

                    controller.createToDo(title, message, done);
                    break;

                case 3:
                    System.out.println("Type the id from the item toDo that you wish to mark as done: ");
                    int idMark = scanner.nextInt();

                    controller.markAsDone(idMark);
                    break;

                case 4:
                    System.out.println("Type the id from the item toDo that you wish to delete: ");
                    int idDelete = scanner.nextInt();

                    controller.deleteToDo(idDelete);
                    break;

                case 5:
                    System.out.println("Type the name file that you wish to save: ");
                    String filename = scanner.nextLine();

                    controller.saveAsText(filename + ".txt");
                    break;

                case 6:
                    scanner.close();

                    System.out.println("Thanks for using our app ToDo");

                    isRunning = false;
                    break;
                default:
                    System.out.println("Choose a number between 1, 2 or 3");
                    break;
            }
        }
    }
}
