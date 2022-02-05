package a01codingpractice.hackerrank;
import java.awt.desktop.ScreenSleepEvent;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class ReverseArray {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int size  =input.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i<size ; i++) {
            int a = input.nextInt();
           arr.add(a);
        }

        Collections.reverse(arr);
        for (int i = 0; i <arr.size() ; i++) {
            System.out.print(arr.get(i)+" ");

        }

    }
}
