package exercises.maps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyAppOther {
    public static final int ADD_EMPLOYEE = 0;
    public static final int FIND_EMPLOYEE = 1;
    public static final int EXIT = 2;

    private CompanyOther company;

    CompanyAppOther() {
        company = new CompanyOther();
    }

    public static void main(String[] args) {
        CompanyAppOther companyAppOther = new CompanyAppOther();
        try (Scanner sc = new Scanner(System.in)) {
            int userOption;
            do {
                companyAppOther.printOptions();
                userOption = sc.nextInt();
                sc.nextLine();

                switch (userOption) {
                    case CompanyAppOther.ADD_EMPLOYEE:
                        companyAppOther.addEmployee(sc);
                        break;
                    case CompanyAppOther.FIND_EMPLOYEE:
                        companyAppOther.findAndPrintEmployee(sc);
                        break;
                    case CompanyAppOther.EXIT:
                        break;
                }
            } while (userOption != CompanyAppOther.EXIT);
        } catch (InputMismatchException e) {
            System.err.println("Nieprawidłowy format danych");
        }
    }

    private void printOptions() {
        System.out.println("0 - dodanie pracownika");
        System.out.println("1 - wyszukiwanie pracownika");
        System.out.println("2 - wyjscie z programu");
    }

    private void addEmployee(Scanner sc) {
        Employee employee = new Employee();

        System.out.println("Dodawanie pracownika");
        System.out.println("Imię: ");
        employee.setFirstName(sc.nextLine());
        System.out.println("Nazwisko: ");
        employee.setLastName(sc.nextLine());
        System.out.println("Pensja: ");
        employee.setSalary(sc.nextInt());
        sc.nextLine();

        company.addEmployee(employee);
    }

    private void findAndPrintEmployee (Scanner sc) {
        System.out.println("Wyszukiwanie pracownika.");
        System.out.println("Podaj imie:");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = sc.nextLine();

        Employee employee = company.getEmployee(firstName, lastName);
        System.out.println(employee);
    }
}
