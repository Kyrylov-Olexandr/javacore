package homework3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int p = rectangle.perimeter();
        int a = rectangle.area();
        String result1 = "Rectangle perimeter = " + p + '\n' + "Rectangle area = " + a;
        System.out.println(result1);

        Circle circle = new Circle();
        String result2 = "Circle length = " + circle.length() + '\n' + "Circle area = " + circle.area();
        System.out.println(result2);

    }



}