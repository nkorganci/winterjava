package day14constructorsstatickeywordarrays_V19;

public class P2_Main {
    public static void main(String[] args) {
        P1_Player obj = new P1_Player(1,"Enver");

        //Static variables are class variables no need to use object or instance
        System.out.println(P1_Player.counter);

        //Instance variables can be called by object or instance
        System.out.println(obj.id);
    }
}
