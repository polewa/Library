package exercises.writeToFile;

import java.io.*;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";

        Person p1 = null;

        try (
                FileInputStream fileInputStream = new FileInputStream(fileName);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                ) {
            p1 = (Person) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (p1 != null) {
            System.out.println("Wczytano dane o: ");
            System.out.println(p1.getFirstName() + " " + p1.getLastName());
        }
    }
}
