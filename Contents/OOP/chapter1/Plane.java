package chapter1;

public class Plane {
    public static void main(String[] args) {
        FighterPlane myFighter = new FighterPlane(5, 20, 20, 0, 0);

        myFighter.moveRight();
        myFighter.moveRight();
        myFighter.moveForward();
        System.out.printf("(%d, %d)\n", myFighter.x, myFighter.y);
    }
}