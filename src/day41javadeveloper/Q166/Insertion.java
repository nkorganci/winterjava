package Q166;

public class Insertion {

   void insertionSort(int values[] ){
        int n = values.length;
        for (int j = 1; j < n ; j++) {
            int tmp = values[j];
            int i = j-1;

            assert i < 0 || values[i] <= values[i + 1];
            while((i>-1) && (values[i] >tmp)){
                values[i+1] = values[i];
                i--;

            }
            values[i+1] = tmp;

        }
    }
    /*
    After which line can we insert assert i < 0 || values[i] <= values[i + 1]; to verify that the values array is
partially sorted?
A. after line 8
B. after line 6
C. after line 5
D. after line 10
Answer: B
     */
}
