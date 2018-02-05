package exercises.recurency;

public class NumberAdder {
    public static void main(String[] args) {
        NumberAdder adder = new NumberAdder();

        int number = adder.sum(50);
        System.out.println(number);
    }

    public int sum(int n) {
        if (n > 1) {
            System.out.println(n + "+" + "sum(" + (n - 1) + ")");
            return n + sum(n - 1);
        } else {
            return n;
        }
    }
}
