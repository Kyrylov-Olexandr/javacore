package homework4.car;


public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.changeSteeringWheelSize();
        car.changeSteeringWheelColor();
        car.changeBodyColor();
        car.changeBodyType();
        car.changeWheelsAmount();
        car.changeWheelsType();

        System.out.println(car.vehicle());

    }
}
