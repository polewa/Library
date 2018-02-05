package exercises.exceptions;

public class TestNumber {
    public static void main(String[] args) {
        Numbers nums = new Numbers();
        /*
        // wszystko ok
        nums.add(3, 5);
        // wszystko ok, pobieramy wcześniej dodaną liczbę
        int number3 = nums.get(3);
        System.out.println(number3);
        // błędy indeks, wygenerowanie wyjątku
        nums.add(9, 20);
        // błędy indeks, gdyby kod dotarł do tego miejsca
        // również wygenerowany zostałby wyjątek
        int number20 = nums.get(20);
        System.out.println(20);
        */

        try {
            // wszystko ok
            nums.add(3, 5);
            // wszystko ok, pobieramy wcześniej dodaną liczbę
            int number3 = nums.get(3);
            System.out.println(number3);
            // błędy indeks, wygenerowanie wyjątku
            nums.add(20, 20);
            // błędy indeks, gdyby kod dotarł do tego miejsca
            // również wygenerowany zostałby wyjątek
            int number20 = nums.get(20);
            System.out.println(20);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
