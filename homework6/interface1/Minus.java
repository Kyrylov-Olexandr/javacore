package homework6.interface1;

public interface Minus {

    default int minus(int a, int b) {
        return a - b;
    }

}
