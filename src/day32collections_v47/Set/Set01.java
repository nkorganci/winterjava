package day32collections_v47.Set;


import java.util.HashSet;
import java.util.Iterator;

// Must have unique value
// Can have null
public class Set01 {

    public static void main(String[] args) {
        HashSet<Integer> hashSet= new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(30);// Repeated can be written but will not be shown in print
        System.out.println(hashSet.size() + " is the size");
        //hashSet.add("Hello") CTE

        for(Integer sayi:hashSet){
            System.out.println(sayi);

            //Iterator
            Iterator<Integer> itr = hashSet.iterator();
            while (itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }
}
