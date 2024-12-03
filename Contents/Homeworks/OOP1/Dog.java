package OOP1;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(this.name + ": Dog is Grrrr!!");
    }

    public void breath() {
        System.out.println("Breath grrrr");
    }
}
