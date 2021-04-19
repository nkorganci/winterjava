package Q163;

import Q149.A;
import Q149.B;

import java.util.Comparator;

public class CodeFragmentCompiles {//Answer: D

    /*
    A Comparator comparator = new Comparator<?>(){
       public int compare(Integer i, Integer j){
       return i.compareTo(j);
       }
       }
    B   var comparator = new Comparator<>(){
         public int compare(Integer i , Integer j){
         return i.compareTo(j);
         }
         }
    C Comparator<> comparator = new Comparator<Integer>(){
    public int compare(Integer i , Integer j){
    return i.compareTo(j);
    }
    }
    D Comparator<Integer> cmparator = new Comparator<>(){
    public int compare(Integer i, Integer j){
    return i.compareTo(j);
    }
    }
   A. Option A
B. Option B
C. Option C
D. Option D




     */
    public static void main(String[] args) {
//A
//        Comparator comparator = new Comparator<?>(){
//            public int compare(Integer i, Integer j){
//                return i.compareTo(j);
//            }
//        };
//        B
//         var comparator = new Comparator<>(){
//            public int compare(Integer i , Integer j){
//                return i.compareTo(j);
//            }
//        };

// C
////         Comparator<> comparator = new Comparator<Integer>(){
////            public int compare(Integer i , Integer j){
////                return i.compareTo(j);
//            }
//        };
    	
  

        Comparator<Integer> comparator = new Comparator<>() {
            public int compare(Integer i, Integer j) {
                return i.compareTo(j);
            }
        };
    }
}
