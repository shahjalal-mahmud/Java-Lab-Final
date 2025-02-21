class Animal{
    String name;
    int age;
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void dsiplay(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Mammal extends Animal{
    Mammal(String name, int age){
        super(name, age);
    }
    void eat(){
        System.out.println("Eating Mammal: Grass");
    }
}
class Dog extends Mammal{
    Dog(String name, int age){
        super(name, age);
    }
    void bark(){
        System.out.println("Barking dog: Gheu Gheu");
    }
}

class Cat extends Mammal{
    Cat(String name, int age){
        super(name, age);
    }
    void meow(){
        System.out.println("Meow Meow");
    }
}

public class Problem01{
    public static void main(String[] args) {
        Dog obj = new Dog("Tommy", 5);
        obj.dsiplay();
        obj.bark();
        obj.eat();

        Cat obj2 = new Cat("Kitty", 3);
        obj2.dsiplay();
        obj2.meow();
        obj2.eat();
        // obj2.bark(); // error
    }
}

// Animal // superclass
// Mammal Dog // subclass


// Animal // superclass

// Mammal // intermediete class

// Dog // sub class