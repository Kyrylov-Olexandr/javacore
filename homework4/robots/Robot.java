package homework4.robots;

public class Robot {
    void work() {
        System.out.println("Я Robot - я просто працюю");
    }

}
class CoffeRobot extends Robot {
    @Override
    void work() {
        System.out.println("Я CoffeRobot – я варю каву");
    }
}
class RobotDancer extends Robot {
    @Override
    void work() {
        System.out.println("Я RobotDancer – я просто танцюю");
    }
}
class RobotCoocker extends Robot {
    @Override
    void work() {
        System.out.println("Я RobotCoocker – я просто готую");
    }
}
