package day01vairables.day30interfaces_43;


public interface Animal {
    //int eat(); //Do not use different return types, use same names
    void eat();
}

interface Mammal {
    void eat();
}

interface Carnivorous {
    void eat();
}

interface DomesticPet extends Animal, Mammal, Carnivorous {


}