package lesson10.ToDoList;

public class ToDo {

    private String title;
    private String due;
    private TaskDetails taskDetails;

    public ToDo(String title, String due, TaskDetails taskDetails) {
        this.title = title;
        this.due = due;
        this.taskDetails = taskDetails;
    }

    public String getDue() {
        return due;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %s ", title,taskDetails.getDescription(), due);
    }

    public static class TaskDetails {
        private String description;

        public TaskDetails(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
