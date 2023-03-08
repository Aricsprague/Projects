/*Abstraction. Using simple things to represent complexity. We all know how to turn the TV on,
but we don’t need to know how it works in order to enjoy it.
In Java, abstraction means simple things like objects, classes and variables represent more complex underlying code and data.
This is important because it lets you avoid repeating the same work multiple times.*/

// Abstract Class
abstract class Car {
public abstract void carEngine();
public void horn(){
    System.out.println("Beep Beep!");
    }
}
// Subclass
class Corvette extends Car {
    public void carEngine() {
        System.out.println("The Corvette has a V8");
    }
}
// Use of Abstract class
class Main {
    public static void main(String[] args) {
        Corvette myCar = new Corvette();
        myCar.carEngine();
        myCar.horn();
    }
}