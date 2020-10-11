package Pets;

public class Main {
    public static void main(String[] args) {
        Pet[] pets = { new Cat(), new Cow(), new Dog() };
        for(Pet elem : pets) {
            elem.voice();
        }
    }
}
