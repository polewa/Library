package exercises.recurency;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dla jakiej liczby chcesz obliczyć silnie:");
        int x = scanner.nextInt();
        System.out.println("Silnia wynosi: " + silnia(x));
    }

    public static int silnia(int x) {
        return x > 1 ? x * silnia(x - 1) : 1;
    }
}
