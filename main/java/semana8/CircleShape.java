package semana8;

public class CircleShape extends Shape{
    private double radius;

    public CircleShape() {
        super();
        this.radius = 1.0;
    }

    public CircleShape(double radius) {
        super();
        this.radius = radius;
    }

    public CircleShape(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]"; 
    }


}
