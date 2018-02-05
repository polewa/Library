package exercises.strings;

public class StringTest {
    public static void main(String[] args) {
        /*String s1 = "Ania";
        String s2 = "Ania";
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1.equals(s2) " + (s1.equals(s2)));

        String s3 = new String("Kasia");
        String s4 = new String("Kasia");
        System.out.println("s3 == s4 " + (s3 == s4));
        System.out.println("s3.equals(s4) " + (s3.equals(s4)));*/

        /*StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
            builder.append(" ");
        }
        String numbers = builder.toString();

        System.out.println(numbers);*/

        long time1, time2;

        long startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
            builder.append(" ");
        }
        String numbers = builder.toString();
        time1 = System.nanoTime() - startTime;
        System.out.println("Time1: " + time1);
        System.out.println(numbers);

        startTime = System.nanoTime();
        String numbers2 = "";
        for (int i = 0; i < 1000; i++) {
            numbers2 += i + " ";
        }
        time2 = System.nanoTime() - startTime;
        System.out.println("Time2: " + time2);
        System.out.println(numbers2);

        System.out.println("Time2 / Time1: " + time2/time1);
    }
}
