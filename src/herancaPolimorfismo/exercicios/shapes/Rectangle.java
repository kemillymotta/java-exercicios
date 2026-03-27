package herancaPolimorfismo.exercicios.shapes;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(Color color) {
        super(color);
    }

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;    }
}
