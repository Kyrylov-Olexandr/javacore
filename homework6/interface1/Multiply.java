package homework6.interface1;

public interface Multiply {

    default int multiply(int a, int b) {
        return a * b;
    }

}
