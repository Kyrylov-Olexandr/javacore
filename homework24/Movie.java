package javacore.homework24;

public class Movie {
    String title;
    Time duration;

    public Movie(String title, Time duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return title + ", тривалість: " + duration.hour + "год " + duration.min + "хв" + ";";
    }
}
