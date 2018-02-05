package exercises.enums;

import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dostępne pizze:");
        for (Pizza p: Pizza.values()) {
            System.out.println(p);
        }
        System.out.println("Podaj jaką chcesz wybrać pizzę:");
        Pizza pizza = Pizza.valueOf(scanner.nextLine());
        System.out.println("Czy to pizza którą chcesz wybrać: " + pizza);

    }
}
