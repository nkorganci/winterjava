package a_Questions;

import java.util.List;
import java.util.Optional;

public class QUESTIONS {


    public static void main(String[] args) {

    }

    public static Optional<Integer> maxElements1(List<Integer> list) {

        /*
        8- Create a method to calculate maximum element in the list.
         */

        // Optional<Integer> maxEl = list.stream().reduce((x, y) -> Math::max); // ?? did not work why

        Optional<Integer> maxEl1 = list.stream().reduce((x, y) -> x > y ? x : y);

        // If you use just Lambda Expression in reduce() method,return type is Optional<Integer>

        return maxEl1;
    }

}


    //3rd Way
    //int sum2 =0;
// int sum3 = IntStream.rangeClosed(starting, ending).filter(t -> t % 2 == 0).forEach(t->sum2+=t);





