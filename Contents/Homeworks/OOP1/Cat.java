package OOP1;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(this.name + ": Cat is meow!!");
    }

    public void breath() {
        System.out.println("Breath meeewww");
    }
}
