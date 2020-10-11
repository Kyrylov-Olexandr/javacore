package Amphibia;

import java.lang.reflect.Method;

public class Amphibia {
    String name = "Амфибия";

    public String getName() {
        return name;
    }

    Amphibia() { }
    void eat() {
        System.out.println(this.getName() + " їсть");
    }
    void sleep() {
        System.out.println(this.getName() + " спить");
    }
    void swim() {
        System.out.println(this.getName() + " плаває");
    }
    void walk() {
        System.out.println(this.getName() + " гуляє");
    }

}
class Frog extends Amphibia {
    String name = "Жаба";

    @Override
    public String getName() {
        return name;
    }
}
