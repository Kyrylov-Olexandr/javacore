package javacore.homework9.task1_taks3;
/**
 * Class with Seasons parameters
 */
public enum Seasons {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    String name;

    Seasons(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
