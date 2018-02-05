package exercises.generics;

public class Container<T> {
    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }

    public void printObjects() {
        for (Object o: array) {
            System.out.println(o);
        }
    }
}
