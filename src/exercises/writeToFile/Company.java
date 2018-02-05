package exercises.writeToFile;

import java.io.Serializable;

public class Company implements Serializable {

    private static final long serialVersionUID = -7425273230264572679L;

    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Company(Employee[] tab){
        this.employees = tab;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            builder.append(employees[i]);
        }
        return builder.toString();
    }
}
