package a02Review;

public class AE {
    static int m(int [] a){
        int min = a[0];

        for (int i = 1; i <a.length ; i++) {
            if(min>a[i]){
                min = a[i];
            }
        }

        return min;
    }
    public static void main(String[] args) {
        AE.m(new int []{2,4,5,});
    }
}
// What is the class name of Java array?
class ZA{
    public static void main(String[] args) {
        int arr[] = {2,4,5};
        Class c = arr.getClass();
        System.out.println(c);

        String name = c.getName();
        System.out.println(name);
    }
}

// Example of Copying an Array in Java
