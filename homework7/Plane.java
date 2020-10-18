package homework7;

public abstract class Plane extends Control {
    int width;
    int height;
    float weight;

    public Plane(int width, int height, float weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    void engineStart() {
        int min = 20;
        int max = 88 - 20;
        int time =  (int) (Math.random() * ++max) + min;
        System.out.println("Ready in " + time + "s.");
    }

    void takeOff() {
        double maxDistance = Math.random() * 1000;
        System.out.println("Max flight distance: " + (int) maxDistance + "km.");
    }

    void landing() {
        System.out.println("The plane is landing");
    }

}

