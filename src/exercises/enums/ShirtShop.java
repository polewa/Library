package exercises.enums;

public class ShirtShop {
    public static void main(String[] args) {
/*
        System.out.println("Dostępne rozmiary tshirtów: ");
        for (Size s: Size.values()) {
            System.out.println(s.getDescription());
        }

        Tshirt tshirt = new Tshirt();
        tshirt.setSize(Size.MEDIUM);
        System.out.println("Wybrałeś tshirt w rozmiarze: " + tshirt.getSize().getDescription());
*/

/*
        Tshirt tshirt = new Tshirt();
        System.out.println("Wybierz rozmiar koszulki: ");
        tshirt.setSize(Size.valueOf("MEDIUM"));
        System.out.println("Wybrałeś thirt w rozmiarze: " + tshirt.getSize().getDescription());
*/
        System.out.println("Dostępne rozmiary tshirtów: ");
        for (Size s: Size.values()) {
            System.out.println(s.getDescription());
        }

        Tshirt tshirt = new Tshirt();
        System.out.println("Wybierz rozmiar koszulki: ");
        Size tshirtSize = sizeFromDescription("abc");
        tshirt.setSize(tshirtSize);
        System.out.println("Wybrałeś tshirt w rozmiarze: " + tshirt.getSize().getDescription());
    }

    static Size sizeFromDescription(String desc) {
        for (Size s: Size.values()) {
            if(s.getDescription().equals(desc)) return s;
        }
        return Size.MEDIUM;
    }
}
