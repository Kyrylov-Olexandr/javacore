package ScientificNotation;


import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        float maxFloat = Float.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;

        Formatter formatter = new Formatter();
        Formatter formatter1 = new Formatter();
        var exMaxFloat = formatter.format("%e", maxFloat).toString();
        var exMaxDouble = formatter1.format("%e", maxDouble).toString();
        System.out.println(exMaxDouble + "\n" + exMaxFloat);

    }
}
