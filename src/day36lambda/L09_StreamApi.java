package day36lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class L09_StreamApi {

    public static void main(String[] args) {
        //1st way to create stream
        Stream stream = Stream.of(5,1,2,3);

        //2nd Way to create
        List<String> list = new ArrayList<>();
        list.add("hi");

        Stream stream2 = list.stream();


    }
}
