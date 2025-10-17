package Problem6;
public class Circle extends Forme {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.round( Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle (radius " + radius + " cm)";
    }
}