package homework7;

public class Control {

    String distance() {
            return String.format("%.2f", Math.random() * 10) + "km";
    }

    void forward() {
        System.out.println("Su-27 is moving " + distance() + " forward.");
    }

    void back() {
        System.out.println("Su-27 is moving " + distance() + " back.");
    }

    void  left() {
        System.out.println("Su-27 is moving " + distance() + " left.");
    }

    void right() {
        System.out.println("Su-27 is moving " + distance() + " right.");
    }

}
