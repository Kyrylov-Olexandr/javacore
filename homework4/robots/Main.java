package homework4.robots;

public class Main {
    public static void main(String[] args) {
        var robot = new Robot();
        var coffeRobot = new CoffeRobot();
        var robotDancer = new RobotDancer();
        var robotCoocker = new RobotCoocker();


        Robot[] robots = { robot, coffeRobot, robotDancer, robotCoocker };
        for (Robot elem : robots) {
            elem.work();
        };
    }
}
