package day01vairables.day14constructorsstatickeywordarrays_V19;
public class P1_Player {
    public int id;
    public String name;
    public static int counter=10;
    public static String game="static name";//if you dont initialize, it will be NULL(default value)
        //Constructor
        public P1_Player(int id,String name){
        this.id=id;
        this.name=name;
    }
        //Class
    public void countClass(){
            counter++;
    }
    //
    public static void main(String[] args) {
        //static variable can be used in class anywhere
        System.out.println("Used only static name "+ game);
        System.out.println("used static variable and class name "+P1_Player.counter); // I can use class to call static too, but no need it

        P1_Player obj = new P1_Player(22,"In main method");
        System.out.println(obj.id);// I need to create a constructor to reach instance variable

        obj.countClass();
        System.out.println(counter);
    }

}

class Main{
    public static void main(String[] args) {
        P1_Player obj = new P1_Player(33,"nonstatic variable to initialize");
        System.out.println("Non Static should be called by constructor: "+ obj.id + " " +" static should be called by class name: "+P1_Player.counter);

        obj.countClass();
        System.out.println(P1_Player.counter);
    }
}


