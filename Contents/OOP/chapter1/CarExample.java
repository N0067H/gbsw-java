package chapter1;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car("Small", "Red", 30, 20);
        System.out.println("===============================");
        System.out.println("car1 company: " + car1.company);
        System.out.println("car1 model: " + car1.model);
        System.out.println("car1 color: " + car1.color);
        System.out.println("car1 maxSpeed: " + car1.maxSpeed);
        System.out.println("car1 speed: " + car1.speed);
        System.out.println("===============================");

        System.out.println();

        Car car2 = new Car("Big", "Blue", 10, 5);
        System.out.println("===============================");
        System.out.println("car2 company: " + car2.company);
        System.out.println("car2 model: " + car2.model);
        System.out.println("car2 color: " + car2.color);
        System.out.println("car2 maxSpeed: " + car2.maxSpeed);
        System.out.println("car2 speed: " + car2.speed);
        System.out.println("===============================");

        System.out.println();

        Car car3 = new Car("Midium", "Black", 30, 5);
        System.out.println("===============================");
        System.out.println("car3 company: " + car3.company);
        System.out.println("car3 model: " + car3.model);
        System.out.println("car3 color: " + car3.color);
        System.out.println("car3 maxSpeed: " + car3.maxSpeed);
        System.out.println("car3 speed: " + car3.speed);
        System.out.println("===============================");
    }
}

