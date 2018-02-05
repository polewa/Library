package exercises.exceptions;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public double suma(double x, double y){
        return x + y;
    }

    public double odejmowanie(double x, double y){
        return x - y;
    }

    public double mnozenie(double x, double y){
        return x * y;
    }

    public double dzielenie(double x, double y){
        if (y == 0) {
            throw new ArithmeticException("Nie dziel przez zero Ty cholero!!");
        }
        return x / y;
    }

    public void menu(double x, double y) throws UnknownOperatorException {
        System.out.println("Podaj operator: ");

        String wybor = scanner.next();

        switch (wybor) {
            case "+":
                System.out.println("Suma wynosi: " + suma(x, y));
                break;
            case "-":
                System.out.println("Odejmowanie wynosi: " + odejmowanie(x, y));
                break;
            case "*":
                System.out.println("Mnozenie wynosi: " + mnozenie(x, y));
                break;
            case "/":
                System.out.println("Dzielenie wynosi: " + dzielenie(x, y));
                break;
            default:
                throw new UnknownOperatorException("Nie ma takiego operatora!! Użyj +-*/.");
        }
        scanner.close();
    }
}
