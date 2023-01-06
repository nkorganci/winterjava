package day32collections_v47.collectionsAshok;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

// Fail fast Collection
public class A18_FailFastFailSafe {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);

        // Will print and will not give error
        for(Integer num:arrayList){
            System.out.println(num);
        }

        //Will give exception //ConcurrentModificationException
        for(Integer num:arrayList){
            System.out.println(num );
            if(num==2){
                arrayList.add(33);
            }
        }
    }
}

// Fail Safe Collection

class FailSafe{

    public static void main(String[] args) {

//        ArrayList<Integer> num = new ArrayList<>(); // FAILFAST COLLECTON
        CopyOnWriteArrayList<Integer> num = new CopyOnWriteArrayList<>();// FAILSAFE COLLECTION
        num.add(1);
        num.add(4);
        num.add(44);

        for(Integer n: num){
            System.out.println(n);
            if(n==1){
                num.add(3423);
            }
        }

        System.out.println(num);
    }
}
