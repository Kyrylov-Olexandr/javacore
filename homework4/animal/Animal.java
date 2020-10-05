package homework4.animal;

public class Animal {
    private String name, speed, age;
    public Animal(String n, String s, String a) {
        name = n; s = speed; a = age;
    }
    public Animal() {
        name = "Якась тварина";
        speed = "5 км/год";
        age = "1 рік";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
