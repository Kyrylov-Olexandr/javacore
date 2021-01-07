package javacore.homework24;
import java.util.*;

public class Cinema {
    TreeMap<Days, Schedule> schedules = new TreeMap<>();;
    ArrayList<Movie> moviesLibrary = new ArrayList<>();
    Time open;
    Time close;

    Cinema() {
        for (Days day : Days.values()) {
            schedules.put(day, new Schedule());
        }
    }

    void addMovie (Movie movie) {
        moviesLibrary.add(movie);
    }
    void addSeance (Seance seance, String day) {
        Schedule schedule = schedules.get(Days.valueOf(day));
        schedule.addSeance(seance);


    }
    void removeMovie(Movie movie) {
        moviesLibrary.remove(movie);
        schedules.values().forEach((schedule) ->
                schedule.seances.removeIf(seance -> seance.movie == movie));
    }
    void removeSeance (Seance seance, String day) {
        schedules.get(Days.valueOf(day)).removeSeance(seance);
    }

}
