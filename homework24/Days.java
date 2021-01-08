package javacore.homework24;

public enum Days {
    SUNDAY("Неділя"),
    MONDAY("Понеділок"),
    TUESDAY("Вівторок"),
    WEDNESDAY("Середа"),
    THURSDAY("Четвер"),
    FRIDAY("П'ятниця"),
    SATURDAY("Субота");

    private final String title;

    Days(String title) {
        this.title = title;
    }

    public  static Days getValueFromTitle(String title) {
        for (Days day : Days.values()) {
            if (day.getTitle().equals(title)) {
                return day;
            }
        }
        return Days.FRIDAY;
    }
    public String getTitle() {
        return title;
    }
}
