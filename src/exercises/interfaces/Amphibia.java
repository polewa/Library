package exercises.interfaces;

public class Amphibia implements Automobil, Boat {
    @Override
    public void printName() {
        System.out.print("Amphibia to trochę: ");
        Automobil.super.printName();
        System.out.print(" a trochę ");
        Boat.super.printName();
    }
}
