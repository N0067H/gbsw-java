package OOP1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Nabi");
        cat.introduce();
        cat.bark();
        cat.breath();
        
        System.out.println();

        Dog dog = new Dog("Baduk");
        dog.introduce();
        dog.bark();
        dog.breath();
    }
}