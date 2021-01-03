//package javacore.homework7;
//
//public class Su27 extends Plane implements homework7.SpecialAbilities {
//    int maxSpeed;
//    String color;
//
//    public Su27(int width, int height, float weight, int maxSpeed, String color) {
//        super(width, height, weight);
//        this.maxSpeed = maxSpeed;
//        this.color = color;
//    }
//
//
//    @Override
//    public void turbo() {
//        double turbo = (Math.random() * 200) + maxSpeed;
//        System.out.println("Turbo acceleration used. Current speed: " + (int) turbo + " km/h");
//    }
//
//    @Override
//    public void stealth() {
//        double stealth = Math.random() * 60;
//        System.out.println("Su27 is out of sight for " + (int) stealth + "s");
//    }
//
//    @Override
//    public void bomb() {
//        double amount =  Math.random() * 10;
//        System.out.println("Su 27 dropped " + (int) amount + " bombs");
//    }
//}
