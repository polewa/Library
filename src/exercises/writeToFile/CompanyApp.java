package exercises.writeToFile;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] tab = new Employee[2];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj imię:");
            String firstName = scanner.nextLine();
            System.out.println("Podaj nazwisko:");
            String lastName = scanner.nextLine();
            System.out.println("Podaj pensje:");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            tab[i] = new Employee(firstName, lastName, salary);
        }

        String fileName = "company.txt";
        try(
                FileOutputStream fs = new FileOutputStream(fileName);
                ObjectOutputStream os = new ObjectOutputStream(fs);
        ) {
            for (int i = 0; i < tab.length; i++) {
                os.writeObject(tab[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Zapisano obiekt do pliku");
        Employee[] tab1 = new Employee[tab.length];

        try (
                FileInputStream fileInputStream = new FileInputStream(fileName);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            for (int i = 0; i < tab1.length; i++) {
                tab1[i] = (Employee) objectInputStream.readObject();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != null) {
                System.out.println("Wczytano dane o: ");
                System.out.println(tab1[i].toString());
            }
        }

    }
}
