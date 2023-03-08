/*Polymorphism. Allows programmers to use the same word in Java to mean different things in different contexts.
One form of polymorphism is method overloading. That’s when the code itself implies different meanings.
The other form is method overriding. That’s when the values of the supplied variables imply different meanings. */

//Parent Class containing method
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
// Subclass using polymorphism to change the method
class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: SKREEEE");
    }
}
// Another subclass changes the same method again
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: I am inferior to cats");
    }
}
class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}