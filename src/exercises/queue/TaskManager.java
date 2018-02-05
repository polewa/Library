package exercises.queue;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    Queue<Task> listaToDo;

    public TaskManager() {
        this.listaToDo = new PriorityQueue<>();
    }

    public void addTask(Task task) {
        listaToDo.offer(task);
    }

    public void pullTask() {
        System.out.println(listaToDo.poll());
    }

    public void menu(Scanner scanner) {
        do {
            System.out.println("Program obsługuję prostą kolejkę rzeczy To-Do");
            System.out.println("1 - dodaj nowe zadanie");
            System.out.println("2 - pobierz kolejne zadanie o najwyższym priorytecie");
            System.out.println("3 - wyjdz z aplikacji");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Podaj nazwę zadania:");
                    String name = scanner.nextLine();
                    System.out.println("Podaj opis zadania:");
                    String description = scanner.nextLine();
                    System.out.println("Podaj priorytet do wyboru LOW, MODERATE, HIGH");
                    String priority = scanner.nextLine();
                    addTask(new Task(name, description, Task.Priority.valueOf(priority)));
                    break;
                case 2:
                    pullTask();
                    break;
                case 3:
                    System.out.println("Koniec aplikacji");
                    return;
            }
        } while (true);
    }
}
