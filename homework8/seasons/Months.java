package homework8.seasons;

public enum Months {
    JANUARY("January", 31, Seasons.WINTER),
    FEBRUARY("February", 29, Seasons.WINTER),
    MARCH("March", 31, Seasons.SPRING),
    APRIL("April", 30, Seasons.SPRING),
    MAY("May", 31, Seasons.SPRING),
    JUNE("June", 30, Seasons.SUMMER),
    JULY("July", 31, Seasons.SUMMER),
    AUGUST("August", 31,Seasons.SUMMER),
    SEPTEMBER("September", 30, Seasons.AUTUMN),
    OCTOBER("October", 31, Seasons.AUTUMN),
    NOVEMBER("November", 30, Seasons.AUTUMN),
    DECEMBER("December", 31, Seasons.WINTER);

    String name;
    int day;
    Seasons season;

    Months(String name, int day, Seasons season) {
        this.name = name;
        this.day = day;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public Seasons getSeason() {
        return season;
    }
}
