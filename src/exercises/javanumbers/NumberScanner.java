package exercises.javanumbers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumberScanner {
    public static void main(String[] args) {
        String fileName = "Numbers.txt";

        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader reader = new BufferedReader(fileReader);
                ) {
            String nextLine = null;
            int lines = 0;
            int suma1 = 0;
            BigInteger suma2 = new BigInteger("0");
            while ((nextLine = reader.readLine()) != null) {
                if(lines < 3) {
                    int liczba = Integer.parseInt(nextLine.trim());
                    suma1 += liczba;
                } else if (lines >= 3){
                   suma2 = suma2.add(new BigInteger(nextLine));
                }
                lines++;
            }
            System.out.println("Suma intów = " + suma1);
            System.out.println("Suma bigInt = " + suma2.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
