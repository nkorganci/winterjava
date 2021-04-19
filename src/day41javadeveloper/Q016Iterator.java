//package day41javadeveloper;
//
//import java.util.Iterator;
//
//public class Q016Iterator {
//
//
//{
//        Iterator iter=List.of(1,2,3).iterator();
//
//        while (iter.hasNext()) {
//        foo(iter.next());
//        }
//
//        Iterator iter2=List.of(1,2,3).iterator();
//
//        while (iter.hasNext()) {
//        bar(iter.next());
//        }
//
//
//
//        for (Iterator iter=List.of(1,2,3).iterator();iter.hasNext();) {
//        foo(iter.next());
//        }
//
//        for(Iterator iter2=List.of(1,2,3).iterator();iter.hasNext();) {
//        foo(iter.next());}
//        }
////
////Which loop incurs a compile time error?
////A. the loop starting line 11
////B. the loop starting line 7
////C. the loop starting line 14
////D. the loop starting line 3
////Cevap A C
//
////for loop is not in block