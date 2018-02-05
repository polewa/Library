package exercises.generics;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(5000, "Dominika");
        Pair<String, String> pair2 = new Pair<>("Świnka", "Dominika");
        Pair<Integer, Boolean> pair3 = new Pair<>(2300, Boolean.FALSE);
        PairTest test = new PairTest();
        test.showPair(pair1);
        test.showPair(pair2);
        test.showPair(pair3);
    }

    public <T, V> void showPair(Pair pair) {
        System.out.println("Argument T = " + pair.getArgT() + ", Argument V = " + pair.getArgV());
    }
}
