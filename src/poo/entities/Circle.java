package entities;

public class Circle {

    public double radius;

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return String.format("AREA = %.2f%nPERIMETER = %.2f", area(), perimeter());
    }
}
