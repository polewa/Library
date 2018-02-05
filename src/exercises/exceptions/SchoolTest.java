package exercises.exceptions;

public class SchoolTest {
    public static void main(String[] args) throws NoMoreSpaceException {
        School school = new School(3);
        try {
            school.add(new Student(1, "Jan", "Kowalski"));
            school.add(new Student(2, "Marek", "Bobowski"));
            school.add(new Student(3, "Karol", "Kwiatkowski"));
            school.add(new Student(4, "Ania", "Marciniak"));
        } catch (NoMoreSpaceException e) {
            System.err.println("Nie można dodać tylu osób do szkoły");
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(school.find("Marek", "Bobowski"));
            System.out.println(school.find("Janusz", "Danielak"));
        } catch (NoElementFoundException e) {
            System.err.println("Nie znaleziono takiej osoby!");
            System.err.println(e.getMessage());
        }
    }
}
