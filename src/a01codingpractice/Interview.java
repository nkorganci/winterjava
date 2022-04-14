package a01codingpractice;

public class Interview {
}

 class Example {
    ///*
    //Q: Write an Algorithm that searches for a value in a
    //   sorted m x n integer matrix.
    //	• Integers are sorted in each row.
    //	• The first element in any row > 0 is larger than the
    //	last element of the previous row.
    //	• There are no duplicates in the matrix
    //
    //Input: M = [[11, 14, 16, 17], [21, 24, 27, 28], [32, 33, 37, 39]]
    //k = 16
    //Output: (0,2)
    //Input: M = [[11, 14, 16, 17], [21, 24, 27, 28], [32, 33, 37, 39]]
    //k = 29
    //Output: None
    //*/

     static void main(String[] args) {

        int [][] m = new int [3][4];

        int result;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if(m[i][j]==16){
                    result = m[i][j];
                    System.out.println(i + " " + j);
                }
                if(m[i][j]!=29){
                    System.out.println("None");
                }  else {
                    System.out.println();
                }

            }
        }


    }
}