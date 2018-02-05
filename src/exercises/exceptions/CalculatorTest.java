package exercises.exceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) throws UnknownOperatorException {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double x = 0, y = 0;
        boolean error = true;


        while (error) {
            try {
                System.out.println("Podaj x: ");
                x = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Podaj y: ");
                y = scanner.nextDouble();
                scanner.nextLine();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Nie podałeś liczby! Jeszcze raz!");
            }
        }

        error = true;
        while (error) {
            try {
                calculator.menu(x, y);
                error = false;
            } catch (UnknownOperatorException | ArithmeticException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
