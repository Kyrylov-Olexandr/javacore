package homework4.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        String name = animal.getName();
        String age = animal.getAge();
        String speed = animal.getSpeed();
        System.out.println("Назва тварини = " + name + "," + " Вік тварини = " + age + "," + " Швидкість тварини = " +speed);
        animal.setAge("4 роки");
        animal.setName("Собака");
        animal.setSpeed("15 км/год");
        name = animal.getName();
        age = animal.getAge();
        speed = animal.getSpeed();
        System.out.println("Назва тварини = " + name + "," + " Вік тварини = " + age + "," + " Швидкість тварини = " +speed);
    }

}
