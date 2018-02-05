package exercises.interfaces;

public class Triangle implements Shape {
    private double a, b, c;
    private double height;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double a, double b, double c, double height) {
        setA(a);
        setB(b);
        setC(c);
        setHeight(height);
    }

    @Override
    public double calculateArea() {
        return a * height / 2;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trójkąt, ");
        sb.append("bok A: " + a + ", ");
        sb.append("bok B: " + b + ", ");
        sb.append("bok C: " + c + ", ");
        sb.append("wysokość: " + height + ", ");
        sb.append("pole: " + calculateArea() + ", ");
        sb.append("obwód: " + calculatePerimeter());
        return sb.toString();
    }
}
