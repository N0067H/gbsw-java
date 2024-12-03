package OOP1;

public class Animal {
    protected String name;

    public void introduce() {
        System.out.println("My name is " + this.name);
    }

    public void breath() {
        System.out.println("Breath woo");
    }
}