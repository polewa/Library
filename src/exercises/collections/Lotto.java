package exercises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private ArrayList<Integer> komoraLosujaca;

    public ArrayList<Integer> getKomoraLosujaca() {
        return komoraLosujaca;
    }

    public void setKomoraLosujaca(ArrayList<Integer> komoraLosujaca) {
        this.komoraLosujaca = komoraLosujaca;
    }

    Lotto() {
        komoraLosujaca = new ArrayList<>();
        generate();
    }

    private void generate() {
        for (int i = 1; i <= 49; i++) {
            komoraLosujaca.add(i+1);
        }
    }

    public void randomize() {
        System.out.println("Mieszam elementy w liscie");
        Collections.shuffle(komoraLosujaca);
    }

    public void checkResult(List<Integer> numbers) {
        List<Integer> wynikiLosowania = komoraLosujaca.subList(0, 6);
        System.out.println("Oto wylosowane liczby:");
        for (int i : wynikiLosowania) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Czy twoje liczby trafiły w los");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element " + numbers.get(i) + " występuje w wyniku: " + (Collections.frequency(wynikiLosowania, numbers.get(i)) == 1 ? "True" : "False"));
        }
    }
}
