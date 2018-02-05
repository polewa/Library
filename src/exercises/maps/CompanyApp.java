package exercises.maps;

import exercises.sets.Person;

import java.util.HashMap;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company infoSys = new Company();
        obslugaProgramu(scanner, infoSys);
    }

    public static void obslugaProgramu(Scanner scanner, Company company) {
        int option;
        do {
            System.out.println("Opcje programu:");
            System.out.println("1. Wyświetl pracowników.");
            System.out.println("2. Dodaj pracownika.");
            System.out.println("3. Pobierz pracownika po identyfikatorze.");
            System.out.println("4. Wyjdź z programu.");
            System.out.print("Podaj opcje: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println(company.getBazaPracowników().toString());
                    break;
                case 2:
                    System.out.println("Podaj imię:");
                    String firstName = scanner.nextLine();
                    System.out.println("Podaj nazwisko:");
                    String lastName = scanner.nextLine();
                    System.out.println("Podaj pensję:");
                    int salary = scanner.nextInt();
                    company.dodajPracownika(new Employee(firstName, lastName, salary));
                    break;
                case 3:
                    System.out.println("Podaj nr pracownika:");
                    int key = scanner.nextInt();
                    company.wyszukajPracownikaPoKluczu(key);
                    break;
                case 4:
                    System.out.println("Program się zakończył");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        } while (option != 4);
    }
}

