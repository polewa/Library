package exercises.comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class CompareNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] numbers = new Integer[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }

        System.out.println("Tablica nieposortowana:");
        for (int i : numbers) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Tablica posortowana rosnaco:");
        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Tablica posortowana malejaco:");
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
