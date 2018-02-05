package exercises.maps;

import java.util.HashMap;

public class Company {
    HashMap<Integer, Employee> bazaPracowników;
    public static int key = 1;

    public HashMap<Integer, Employee> getBazaPracowników() {
        return bazaPracowników;
    }

    public void setBazaPracowników(HashMap<Integer, Employee> bazaPracowników) {
        this.bazaPracowników = bazaPracowników;
    }

    public static int getKey() {
        return key;
    }

    public static void setKey(int key) {
        Company.key = key;
    }

    public Company() {
        bazaPracowników = new HashMap<>();
    }

    public void dodajPracownika(Employee employee) {
        bazaPracowników.put(key, employee);
        key++;
    }

    public void wyszukajPracownikaPoKluczu(int key) {
        System.out.println(bazaPracowników.get(key));
    }
}
