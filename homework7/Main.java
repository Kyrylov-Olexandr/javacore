package homework7;

public class Main {
    public static void main(String[] args) {
        Su27 su27 = new Su27(10, 5, 30, 300, "white");
        su27.engineStart();
        su27.takeOff();
        su27.forward();
        su27.left();
        su27.back();
        su27.right();
        su27.stealth();
        su27.bomb();
        su27.turbo();
        su27.landing();
    }
}
