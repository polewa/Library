package exercises.arraysclass;

public class Person {
    private String firstName;
    private String lastName;
    private String pesel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Person(String firstName, String lastName, String PESEL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = PESEL;
    }

    @Override
    public String toString() {
        String result;
        result = "Imię: " + firstName + ", Nazwisko: " + lastName + ", Pesel: " + pesel;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false;
        if (obj == this) return true;

        Person p = (Person) obj;

        if (this.firstName == p.firstName && this.lastName == p.lastName && this.pesel == p.pesel) return true;
        if (this.firstName != null) {
            if (!this.firstName.equals(p.firstName)) return false;
        } else if(this.firstName == null && p.firstName != null)
            return false;
        if (this.lastName != null) {
            if (!this.lastName.equals(p.lastName)) return false;
        } else if (this.lastName == null && p.lastName != null)
            return false;
        if (this.pesel != null) {
            if (!this.pesel.equals(p.pesel)) return false;
        } else if (this.pesel == null && p.pesel != null)
            return false;

        return true;
    }
}
