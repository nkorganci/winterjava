package day25overridingexceptions_36.overridingOverloadingStaticDynamicBinding;

import java.util.ArrayList;
import java.util.List;

public abstract class Pet {
    public abstract void makeSound();
}

class Cat extends Pet{
    public void makeSound(){
        System.out.println("Cat make sound");
    }
}

class Dog extends Pet{
    public void makeSound(){
        System.out.println("Dog makes sound");
    }
}

// PolymorphismExample
class Polymorphism{
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Cat());
        pets.add(new Dog());

        for(Pet pet:pets){
            pet.makeSound();
        }

    }
}
