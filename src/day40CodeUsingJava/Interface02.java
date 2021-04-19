package day40CodeUsingJava;

public class Interface02 {
}



interface Clock {
    int timer = 1; //Line c1
}


//Test.java

class Te2st2342 {
    public static void main(String[] args) {
        Clock [] clocks = new Clock[5]; //Line c2
        for(Clock obj : clocks) {
            //obj.timer++; //Line c3, Interface variables are public, static and final. Their value cannot be changed/incremented
        }
        System.out.println(Clock.timer); //Line c4
    }
}