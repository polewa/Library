package exercises.interfaces;

public abstract class Vehicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // metoda abstrakcyjna
    public abstract void speedUp();
}
