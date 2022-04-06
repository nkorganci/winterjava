package a02Review;

public class L022_Arrays {

    // Passing Array to a Method in Java
    // Find the minimum value of array
    static void min(int arr[]){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println(min);
    }

    public static void main(String[] args) {

        // How to write an array in different ways
        int [] array = new int[3];
        int [] array1 = {2,0,3,4,52};

        //Print an array
        for(int a: array1){
            System.out.println(a);

            // Array question: find minimum value.
            L022_Arrays.min(array1);
        }
    }
}

