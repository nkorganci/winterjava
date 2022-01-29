package day14constructorsstatickeywordarrays_V19;

public class P1_Player {

    public int id;
    public String name;
    public static int counter=0;
    public static String game= "Cs";

    public P1_Player(int id,String name){
        this.id=id;
        this.name=name;

    }

    public static void main(String[] args) {
        //static variable can be used in class anywhere
        System.out.println(counter);
        System.out.println(P1_Player.counter); // I can use class to call static too, but no need it

    }
}


