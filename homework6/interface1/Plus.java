package homework6.interface1;

public interface Plus {

    default int plus(int a, int b) {
        return a + b;

    }
}
