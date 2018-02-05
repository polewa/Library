package exercises.recurency;

public class NumberAdderThreeArgs {
    public static void main(String[] args) {
        NumberAdder adder = new NumberAdder();

        int number = adder.sum(100);
        System.out.println(number);
    }

    public int sum(int n) {
        return n > 1 ? n + sum(n--) : n;
    }
}
