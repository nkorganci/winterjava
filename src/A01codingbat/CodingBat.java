package A01codingbat;

import java.util.Arrays;

public class CodingBat {


    public int makeChocolate(int small, int big, int goal) {

        if(small+5*big<goal){
            return -1;
        }else if(small<big%5){
            return -1;
        }else {
            if(goal<10){
                return goal%5;
            }
        }return goal-big*5;

    }



