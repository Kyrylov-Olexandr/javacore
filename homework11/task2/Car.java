package javacore.homework11.task2;

public class Car {
    int horsepower, year;
    Engine engine;
    SteeringWheel steeringWheel;

    public Car(int horsepower, int year, Engine engine, SteeringWheel steeringWheel) {
        this.horsepower = horsepower;
        this.year = year;
        this.engine = engine;
        this.steeringWheel = steeringWheel;
    }
    public Car() {
        horsepower =  100 + (int) (Math.random() * 900);
        year = 1900 + (int) (Math.random() * 120);
        steeringWheel = new SteeringWheel();
        engine = new Engine();
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsepower=" + horsepower +
                ", year=" + year +
                ", engine=" + engine +
                ", steeringWheel=" + steeringWheel +
                '}';
    }
}
