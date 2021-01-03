package javacore.homework12.task1;

public class SteeringWheel {
    int diameter;
    String material;

    public SteeringWheel(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }
    public SteeringWheel(){
        diameter = (int) (Math.random() * 10) + 1;
        material = ((int) (Math.random() * 2) == 1 ? "Шкіра" : "Дермантин");
    }
    public int getDiameter() {
        return diameter;
    }

    public String getMaterial() {
        return material;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
