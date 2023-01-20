package day41designpatterns.singleton.general;

public class JumpStatements {
    public static void main(String[] args) {
//        a(9);
//        nestedLoop(3);
//        labelBreak();
//        continueStatement();
        breakStatement();

    }

    public static void a(int num) {
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
            if (i == 4) {
                break;
            }

        }

        System.out.println("After Break ");

    }

    public static void nestedLoop(int num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("inner:"+j);
                if (j == 3) {
                    break;
                }

            }
            System.out.println("Outer: " + i);
        }
    }

    public static void labelBreak(){
        aa:
        for (int i = 0; i < 3; i++) {
            bb:
            for (int j = 0; j <3; j++) {
                if(i==2&&j==2){
                    break bb;
                }

                System.out.println(i+ " "+ j);
            }
        }
    }

    public static void continueStatement(){
        for (int i = 0; i < 11; i++) {
            if(i%2==0)
                continue;
            System.out.println(i);

        }

    }

    public static void breakStatement(){
        for (int i = 3; i < 11; i++) {
            if(i%2==0)
                break;
            System.out.println(i);

        }

    }

    public static void returnStatement(){

        System.out.println("hi");
        return;


    }
}
