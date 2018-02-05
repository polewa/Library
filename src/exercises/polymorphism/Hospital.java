package exercises.polymorphism;

public class Hospital {
    private final static int MAX_EMPLOYEE = 3;
    private Person[] employees = new Person[MAX_EMPLOYEE];
    private static int employeeNumber;

    public void addEmployee(Person person) {
        if(employeeNumber >= MAX_EMPLOYEE){
            System.out.println("Nie można dodać więcej pracowników");
        } else {
            employees[employeeNumber] = person;
            employeeNumber++;
        }
    }

    public Person[] getPerson() {
        return employees;
    }

    public void setPerson(Person[] person) {
        this.employees = person;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < employees.length; i++) {
            result += employees[i] + "\n";

        }
        return result;
    }
}
