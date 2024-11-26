package chapter1;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("company: " + car.company);
        System.out.println("model: " + car.model);
        System.out.println("color: " + car.color);
        System.out.println("maxSpeed: " + car.maxSpeed);
        System.out.println("speed: " + car.speed);

        car.speed = 80;
        System.out.println("edited speed: " + car.speed);
    }
}