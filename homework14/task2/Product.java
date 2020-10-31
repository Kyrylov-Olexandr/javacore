package javacore.homework14.task2;

public class Product {

    String name;
    float width, length, weight;

    public Product(String name, float width, float length, float weight) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name +
                "{width=" + width +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }
}
