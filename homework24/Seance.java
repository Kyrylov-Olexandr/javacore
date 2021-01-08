package javacore.homework24;

public class Seance implements Comparable<Seance> {
    Movie movie;
    Time startTime;
    Time endTime;
    int timeInMinutes;

    Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        int hour = startTime.hour + movie.duration.hour;
        if (hour > 24) {
            hour -= 24;
        }
        int min = startTime.min + movie.duration.min;
        if (min > 60) {
            min -= 60;
            hour++;
        }
        endTime = new Time(hour, min);
        timeInMinutes = startTime.hour * 60 + startTime.min;
    }

    @Override
    public String toString() {
        return "Сеанс: "
                + startTime.hour + ":"
                + (startTime.min < 10 ? "0" + startTime.min : startTime.min) + "-"
                + endTime.hour + ":"
                + endTime.min + ", "
                + movie;
    }

    public int compareTo(Seance s) {
        return Integer.compare(timeInMinutes, s.timeInMinutes);
    }
}
