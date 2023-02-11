package day41designpatterns.datastructure.pattern;

public class Pattern1 {
    public static void main(String[] args) {

//        rectanglePattern(4);
        printIndexes(4);

    }

    public static void rectanglePattern(int n){
        for (int i = 0; i < n; i++) {  // Number of Row
            for (int j = 0; j < n; j++) { // Number of Column
                System.out.print("2");
            }
            System.out.println(); // Need to go to next line
        }
    }

    public static void printIndexes(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
