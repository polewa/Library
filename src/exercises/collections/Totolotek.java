package exercises.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Totolotek {
    public static void main(String[] args) {
        Lotto graLotto = new Lotto();
        ArrayList<Integer> los = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program wczytuje od Cb 6 liczb i sprawdza czy wygrałeś w lotka");
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj " + (i+1) + " liczbę:");
            los.add(scanner.nextInt());
        }
        graLotto.randomize();
        graLotto.checkResult(los);
    }
}
