package javacore.homework24;

import java.util.Collections;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Cinema cinema = new Cinema();

    public void main() {
        System.out.println(
                        "Головне меню:\n" +
                        "1) Фільмотека\n" +
                        "2) Розклад сеансів\n" +
                        "3) Вийти"
        );
        switch (scanner.nextLine()) {
            case "1" -> showLibrary();
            case "2" -> showSchedule();
            case "3" -> System.exit(1);

        }
    }
    private Movie selectMovie() {
        System.out.print("Назва: ");
        String movieTitle = scanner.nextLine();
        for (Movie movie : cinema.moviesLibrary) {
            if (movie.title.equalsIgnoreCase(movieTitle)) {
                return movie;
            }
        }
        return null;
    }
    private Movie createMovie() {
        System.out.println("Назва: ");
        String title = scanner.nextLine();
        System.out.println("Тривалість: \n" + "Годин - ");
        int hour = scanner.nextInt();
        System.out.println("Хвилин - " );
        int min = scanner.nextInt();
        Time duration = new Time(min, hour);
        return new Movie(title, duration);
    }
    private Seance selectSeance(Schedule schedule) {
        System.out.println("Введіть номер сеансу: ");
        int num = Integer.parseInt(scanner.nextLine());
        return (Seance) Collections.singletonList(schedule.seances).get(num);

    }
    private Seance createSeance() {
        Movie movie = selectMovie();
        System.out.print("Час початку (наприклад '12:10'): ");
        String[] startTimeArr = scanner.nextLine().split(":");
        int min = Integer.parseInt(startTimeArr[0]);
        int hour = Integer.parseInt(startTimeArr[1]);
        assert movie != null;
        return new Seance(movie, new Time(min,hour));
    }
    private void showLibrary() {
        cinema.moviesLibrary.forEach(System.out::println);
        System.out.println(
                        "1) Додати фільм\n" +
                        "2) Видалити фільм\n" +
                        "3) Назад");
        switch (scanner.nextLine()) {
            case "1" -> cinema.addMovie(createMovie());
            case "2" -> cinema.removeMovie(selectMovie());
            case "3" -> main();
        }
    }
    private void showDays() {
        for (int i = 0; i < Days.values().length; i++) {
            System.out.println((i + 1) +") " + Days.values()[i].getTitle());
        }
    }
    private void showSchedule() {
        System.out.println("Виберіть день:");
        showDays();
        String day = scanner.nextLine();
        Schedule schedule = cinema.schedules.get(Days.values()[Integer.parseInt(day)-1]);
        schedule.showSeances();
        System.out.println("1) Додати сеанс\n" +
                           "2) Видалити сеанс" +
                           "3) Назад");
        switch (scanner.nextLine()) {
            case "1" -> cinema.addSeance(createSeance(), day);
            case "2" -> cinema.removeSeance(selectSeance(schedule), day);
            case "3" -> main();
        }
    }
}