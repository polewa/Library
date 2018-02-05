package exercises.interfaces;

public interface Automobil {
    default void printName() {
        System.out.println("Automobil");
    }
}
