package homework3;

public class Circle {
    double radius, diameter;

    public Circle (double r, double d) {
        radius = r;
        diameter = d;
    }
    public Circle() {
        diameter = 11.2f;
        radius = 11.2f;
    }

    double area() {
        return (Math.PI * (Math.pow((diameter / 2), 2)));
    }

    double length() {
        return (radius * 2 * Math.PI);
    }
}
