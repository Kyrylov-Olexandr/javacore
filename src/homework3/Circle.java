package homework3;

public class Circle {
    double rad, diam;

    public void setDiam(double diam) {
        this.diam = diam;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }


    public double area(double diam) {
        return (Math.PI * (Math.pow((diam / 2), 2)));
    }

    public double length(double rad) {
        return (rad * 2 * Math.PI);
    }
}
