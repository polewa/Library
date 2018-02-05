package exercises.polymorphism;

public class Doctor extends Person {
    private double salaryBonus;

    public Doctor(String name, String lastName, double salary, double salaryBonus) {
        super(name, lastName, salary);
        this.salaryBonus = salaryBonus;
    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + getSalaryBonus();
    }
}
