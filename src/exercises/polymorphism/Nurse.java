package exercises.polymorphism;

public class Nurse extends Person {
    private int overhours;

    public Nurse(String name, String lastName, double salary, int overhours) {
        super(name, lastName, salary);
        this.overhours = overhours;
    }

    public int getOverhours() {
        return overhours;
    }

    public void setOverhours(int overhours) {
        this.overhours = overhours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nadgodziny: " + getOverhours();
    }
}
