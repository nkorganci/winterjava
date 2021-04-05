package day29abstractclass_V42;

public class L00_AbstractInterface {

    //https://www.youtube.com/watch?v=f2Nr29KJpfM

    /*



     */

    /*
    1-Interface class can have only default and static methods
    2-Everything should be public, no private, protected...
    3-If a method is incomplete it must be completed in inherited class.
    4-All variables are final, you need to initialize
    5-Interface contain general information properties
    6-Classes can implement more than one interface class

     */
}

class TestClass {
    public static void main(String[] args) {
        Animal a = new Human(11, 44);

    }
}

interface boy {
    int var =0;

    static String name() {
        return "This is for class which implement" + " boy information is granted";
    }

    int boyCm();

    double boyM();

    default double boyKm() {
        return 0;
    }

}

abstract class Animal implements boy {
    private int boy;
    private int kilo;

    public abstract boolean alive();//this part makes this class as abstract

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }
}

class Human extends Animal{
    public Human(int boy, int kilo){
        this.setBoy(boy);
        this.setKilo(kilo);
    }

    @Override
    public int boyCm() {
        return this.getBoy();
    }

    @Override
    public double boyM() {
        return this.getBoy();
    }

    @Override
    public boolean alive() {
        return true;
    }
}

