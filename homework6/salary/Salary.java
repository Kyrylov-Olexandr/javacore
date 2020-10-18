package homework6.salary;

public interface Salary {
    int month = 500;
    int hour = 5;

    default String salary(int monthOrHour, int num) {
        String hourSalary = "За " + num + " годин працівник заробив " + (hour * num) + "$";
        return hourSalary;
    }

    default String salary(int a) {
        salary(a, 1);
        return "Працівник має фіксовану зарплату " + month + "$";
    }
}
