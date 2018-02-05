package exercises.interfaces;

public interface Boat {
    default void printName() {
        System.out.println("Boat");
    }
}
