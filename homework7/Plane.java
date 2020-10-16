package homework7;

public abstract class Plane {
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
        var distance = (int) Math.random() * 1000;
        System.out.println("Max flight distance: " + distance + "km.");
    }

    void landing() {
        System.out.println("The plane is landing");
    }

}

