package exercises.queue;

import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        taskManager.menu(scanner);
    }
}
