package exercises.strings;

import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        int licznik;

        System.out.println("Podaj ile wyrazów chcesz wprowadzić?");
        licznik = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < licznik; i++) {
            System.out.println("Wprowadź " + (i + 1) + " wyraz: ");
            String wyraz = scanner.nextLine();
            builder.append(wyraz.substring(wyraz.length() - 1, wyraz.length()));
        }
        scanner.close();

        System.out.println(builder);
    }
}
