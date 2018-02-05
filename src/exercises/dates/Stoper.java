package exercises.dates;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
    public static void main(String[] args) throws IOException {
        System.out.println("Program jest prostym stoperem.");
        System.out.println("W celu rozpoczęcia pomiaru należy nacisńąć enter");
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        Instant i1;
        i1 = Instant.now();
        System.out.println("Czas już się liczy!! Jeszcze raz wprowadź \"enter\" aby go zatrzymać.");
        start = scanner.nextLine();
        Instant i2 = Instant.now();
        Duration duration = Duration.between(i1, i2);
        System.out.println("Mineło sekund: " + duration.getSeconds());
    }
}
