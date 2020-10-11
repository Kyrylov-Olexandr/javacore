package Overload;

public class Main {
    class Overload {
        int a;
        int b;

        Overload(int a, int b) {
            this.a = 1;
            this.b = 2;
        }
        Overload(int c) {
            this(c, c);
        }
        Overload() {
            this(0);
        }
    };
}
