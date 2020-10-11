package Pets;

abstract public class Pet {
    abstract void voice();
}
class Cow extends Pet {
    @Override
    void voice() {
        System.out.println("Я корова- Мууу-Мууу");
    }
}
class Cat extends Pet {
    @Override
    void voice() {
        System.out.println("Я кіт- Мяууу-Мяууу");
    }
}
class Dog extends Pet {
    @Override
    void voice() {
        System.out.println("Я пес-Гаууу-Гаууу");
    }
}