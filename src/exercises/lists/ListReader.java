package exercises.lists;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();

        wprowadzanieDanych(numbers);
        try {
            wyswietlenieDanych(numbers);
        } catch (NumberFormatException e) {
            System.err.println("Wprowadziłeś coś co nie jest ani liczbą ani słowem exit");
        }
    }

    public static void wprowadzanieDanych(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę do zsumowania(\"exit\" kończy wprowadzanie liczb): ");
        String input = scanner.nextLine();
        if (input.equals("exit")) {
            return;
        } else {
            list.add(input);
            wprowadzanieDanych(list);
        }
    }

    public static void wyswietlenieDanych(ArrayList<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        int suma = 0;
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
            stringBuilder.append(" + ");
            int skladnik = Integer.parseInt(list.get(i));
            suma += skladnik;
        }
        stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length()," = ");
        System.out.println(stringBuilder + " suma: " + suma);
    }
}
