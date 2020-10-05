package homework4.car;

public class Car {
    private SteeringWheel steeringWheel;
    private Wheels wheels;
    private Body body;
    public Car (SteeringWheel s, Wheels w, Body b) {
        wheels = w;
        steeringWheel = s;
        body = b;
    }
    public Car(){
        wheels = new Wheels();
        steeringWheel = new SteeringWheel();
        body = new Body();
    }

    void changeSteeringWheelColor() {
        steeringWheel.changeColor();
        System.out.println("Колір руля змінено на " + SteeringWheel.getColor());
    }
    void changeSteeringWheelSize() {
        steeringWheel.changeSize();
        System.out.println("Розмір руля змінено на " + SteeringWheel.getSize());
    }
    void changeWheelsType() {
        wheels.changeType();
        System.out.println("Тип резини змінено на " + Wheels.getType());
    }
    void changeWheelsAmount() {
        wheels.changeAmount();
        System.out.println("Кількість колес змінена на "+ Wheels.getAmount());
    }
    void changeBodyType() {
        body.changeType();
        System.out.println("Тип кузова змінено на " + Body.getType());
    }
    void changeBodyColor() {
        body.changeColor();
        System.out.println("Колір кузова змінено на "+ Body.getColor());
    }

    String vehicle() {
        return              "=================================" + "\n" +
                            "Створено: " + Body.getType() + "\n" +
                            "Колір кузова: " + Body.getColor() + "\n" +
                            "Кількість колес: " + Wheels.getAmount() + "\n" +
                            "Тип резини: " + Wheels.getType() + "\n" +
                            "Колір руля: " + SteeringWheel.getColor() + "\n" +
                            "Розмір руля: " + SteeringWheel.getSize();

    }
}

class SteeringWheel  {
    private static int size = 1;
    private static String color = "чорний";

    public static String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void changeColor(){
        if (getColor() == "чорний") { setColor("білий"); }
        else if (getColor() == "білий") { setColor("коричневий"); }
        else { setColor("чорний"); }
    }

    void changeSize() {
        setSize(getSize() < 5 ? getSize() + 1 : 1);

    }
}
class Wheels  {
    private static String type = "літня";
    private static int amount = 2;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static int getAmount() {
        return amount;
    }

    public static String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    void changeType() {
        setType(getType() == "літня" ? "зимова": "літня");
    }
    void changeAmount(){
        setAmount(getAmount() < 6 ? getAmount()+2 : 2);
    }



}
class Body  {
    private static String type = "мотоцикл";
    private static String color = "чорний";

    public static String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void changeType(){
        if (getType() == "мотоцикл") { setType("седан"); }
        else if (getType() == "седан") { setType("фура"); }
        else { setType("мотоцикл"); }
    }

    void changeColor(){
        if (getColor() == "чорний") { setColor("білий"); }
        else if (getColor() == "white") { setColor("коричневий"); }
        else { setColor("чорний"); }
    }
}