package homework3;

public class Rectangle {
    int recWidth, recHeight;
    public Rectangle(int width, int height){
        this.recHeight = height;
        this.recWidth = width;
    }
    public Rectangle() {
        recWidth = 10;
        recHeight = 5;
    }
    static int perimeter(int width, int height) {
        return width + height;
    }
    static int area(int width, int height) {
        return width * height;
    }

}
