package todoappconsole;

/**
 * This class represent the body of the task
 *
 * @author Pedro Henrique Oliveira
 * @version 1.0
 */

public class ToDo {
    private int id;
    private String title;
    private String message;
    private Boolean done;

    /**
     *  Creates a new ToDo item;
     *
     * @param id        The identification of the item
     * @param title     The title of the task
     * @param message   The detailed message
     * @param done      The status of the task
     */

    /**
     * This is a constructor of the class;
     */
    public ToDo(int id, String title, String message, Boolean done) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.done = done;
    }

    /**
     * Return the identification of the task
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Return the title of the task
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Return the detailed message of the task
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Return the status of the task
     *
     * @return if the task is done or no
     */
    public Boolean getDone() {
        return done;
    }

    /**
     * Define a new id for the identification of the task
     *
     * @param id The new identification of the task
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Define a new title for the task
     *
     * @param title New title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Define a new message for the task
     *
     * @param message New message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Define a new status for the task
     *
     * @param done New status
     */
    public void setDone(Boolean done) {
        this.done = done;
    }
}
