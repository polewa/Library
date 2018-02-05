package exercises.polymorphism;

public class Zoo {
    public static void main(String[] args) {
        /*Animal[] animals = new Animal[3];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Mruczek");
        animals[2] = new Animal("Kotopies");

        changeAnimalName(animals[0], "Pieseł");

        for (Animal animal : animals) {
            animal.giveSound();
        }*/

        Animal dog = new Dog("Burek");
        Animal cat = new Cat("Mruczek");

        // Rzutowanie do zmiennej
        Dog specificDog = (Dog) dog;
        specificDog.bark();

        // Rzutowanie w locie
        ((Cat)cat).meow();
    }

    private static void changeAnimalName (Animal animal, String newName) {
        animal.setName(newName);
    }
}
