package exercises.generics;

public class Pair<T, V> {
    private T argT;
    private V argV;

    public T getArgT() {
        return argT;
    }

    public void setArgT(T argT) {
        this.argT = argT;
    }

    public V getArgV() {
        return argV;
    }

    public void setArgV(V argV) {
        this.argV = argV;
    }

    public Pair(T argT, V argV) {
        this.argT = argT;
        this.argV = argV;
    }
}
