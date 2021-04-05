package day31interfacecollections_v46.Interfaceslesson_v46;

/*
1- If it is not must, do not use same names for variables in parent interfaces
2- If you need to use same names for variables in parent interfaces,
when you call variables do not forget to use "interfaces names" otherwise CTE
 */

public interface I01 { // Main class
    int v1 = 2000;
    String name1 = "Audio";
}

interface I02 {
    int v1 = 3000;
    String name1 = "Honda";
}

class Car implements I01, I02 {
    public static void main(String[] args) {

        System.out.println((I01.v1));
        // System.out.println((v1));// Confusion


    }

}
