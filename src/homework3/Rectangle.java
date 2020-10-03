package homework3;

public class Rectangle {
    int w, h;
    public Rectangle(int w, int h){
        this.w = w;
        this.h = h;
    }
    public Rectangle() {
        w = 10;
        h = 5;
    }
    int perimeter() {
        return (w + h) * 2;
    }
    int area() {
        return w * h;
    }


}
