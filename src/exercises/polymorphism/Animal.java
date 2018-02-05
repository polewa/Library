package exercises.polymorphism;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        setName(name);
    }

    public void giveSound() {
        System.out.println("Jestem zwierzęciem i nazywam się " + getName());
    }
}
