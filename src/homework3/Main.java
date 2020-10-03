package homework3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(rectangle.recWidth,rectangle.recHeight);

        int per = Rectangle.perimeter(rectangle1.recWidth, rectangle1.recHeight);
        int ar =  Rectangle.area(rectangle1.recWidth, rectangle1.recHeight);
        System.out.println("Площа прямокутника = " + ar);
        System.out.println("Периметр прямокутника = " + per);

        Circle circle = new Circle();
        circle.setDiam(15.5);
        circle.setRad(13.2);
        String result = "Площа кола = " + circle.area(circle.diam) + "\n" + "Довжина кола = " + circle.length(circle.rad);
        System.out.println(result);


    }



}