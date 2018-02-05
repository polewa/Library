package exercises.innerclasses;

public class SortableTest {

    public static void main(String[] args) {
        Sortable sortable = new Sortable() {
            @Override
            public int[] sort(int[] tab) {
                int n = tab.length;
                do {
                    for (int i = 0; i < n - 1; i++) {
                        if (tab[i] > tab[i + 1]) {
                            int temp = tab[i];
                            tab[i] = tab[i + 1];
                            tab[i + 1] = temp;
                        }
                    }
                    n -= 1;
                } while (n > 1);
                return tab;
            }
        };

        int[] tab = {1, 7, 4, 2, 8, 5, 9, 3, 6, 0};
        System.out.println("Tablica przed posortowaniem:");
        for (int i: tab) {
            System.out.print("[" + i + "]");
        }
        System.out.println();

        sortable.sort(tab);
        System.out.println("Tablioa po posortowaniu:");
        for (int i: tab) {
            System.out.print("[" + i + "]");
        }
    }
}
