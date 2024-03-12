class Animal {
    public void makeSound() {
        System.out.println("different animal sounds");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("bow! bow!");
    }
}

class Duck extends Animal {
    public void makeSound() {
        System.out.println("Quack!Quack!");
    }
}

public class PolymorphismAnimal {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myDuck = new Duck();

        System.out.println("Dog says:");
        myDog.makeSound();

        System.out.println("\nDuck says:");
        myDuck.makeSound();
    }
}
