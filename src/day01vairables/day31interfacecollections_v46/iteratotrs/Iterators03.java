package day01vairables.day31interfacecollections_v46.iteratotrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterators03 {
    /*
    1- List need Wrapper classes, Integer, not int.
    2- Iterator has no reverse method, Collections has.
     */

    public static void main(String[] args) {

        increaseElementsbyTwo();
    }


    public static void increaseElementsbyTwo() {

   	/*
	 	 Create an integer list
		 Increase all elements by 2
		 Print the "list elements" on the console in reverse order.
		 Print the list on the console in reverse order by using reverse()
	*/


        List<Integer> list4 = new ArrayList<>();
        list4.add(12);
        list4.add(13);
        list4.add(14);
        list4.add(15);
        System.out.println(list4);

        ListIterator<Integer> it4 = list4.listIterator();
        while (it4.hasNext()) {
            it4.next();
        }

        while (it4.hasPrevious()) {

            Integer el = it4.previous();
            it4.set(el = el + 2);//For integer assignment is necessary, for String no need to assign because immutable.
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println(list4); //[14, 15, 16, 17]

        Collections.reverse(list4);
        System.out.println(list4);//[17, 16, 15, 14]

    }
}


