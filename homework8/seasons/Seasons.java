package homework8.seasons;

public enum Seasons {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    String name;

    Seasons(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
