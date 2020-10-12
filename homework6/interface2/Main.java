package homework6.interface2;

public class Main {
    public static void main(String[] args) {
        var myCalculator = new MyCalculator();
        var minus = myCalculator.minus(5, 4);
        var plus = myCalculator.plus(5,4);
        var devide = myCalculator.devide(5, 4);
        var multiply = myCalculator.multiply(5, 4);
        System.out.println(
                "Minus = " + minus + "\n" +
                "Plus = " + plus + "\n" +
                "Devide = " + devide + "\n" +
                "Multiply = " + multiply
        );
    }
}
