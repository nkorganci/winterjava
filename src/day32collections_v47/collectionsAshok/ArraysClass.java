package day32collections_v47.collectionsAshok;

public class ArraysClass {

    // Arrays are fixed
    // We can store only one type of data
    public static void main(String[] args) {
        // Way-1
        int[] num = new int[5];
        num[0]=2;
//        num[11]=3;
//        num[2]="hi"; // Type is compile time error
//        System.out.println(num[11]);// Runtime error, arrayIndexOutOfBoundary
        System.out.println(num[0]);

        // Way-2 , Every class has Object as a superclass
        Object [] obj1 = new Object[4];
        obj1[1]=22;
        obj1[0]="Name";
        System.out.println(obj1[0] + " " + obj1[1]);
        System.out.println(obj1);

    }
}
