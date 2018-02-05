package exercises.maps;

import java.util.HashMap;

public class CompanyOther {
    private HashMap<String, Employee> employees;

    public CompanyOther() {
        employees = new HashMap<>();
    }

    public boolean addEmployee(Employee employee) {
        String key = employee.getFirstName() + " " + employee.getLastName();

        if(employees.get(key) != null) {
            return false;
        } else {
            employees.put(key, employee);
            return true;
        }
    }

    public Employee getEmployee(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        return employees.get(key);
    }
}
