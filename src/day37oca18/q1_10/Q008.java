package day37oca18.q1_10;

public class Q008 {

	public static void main(String[] args) {	
		String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " " );
				if (arr[i][j].equals("B")) {
					continue; //has no effect on result, unnecessary
				}
			}
		continue; // has no effect on result, unnecessary
		}	
	}

}
//continue; cannot be used outside of a loop
//break; cannot be used outside of a loop
//shorter way, suggested solution after removing yellow signs.
class Q008a {

	public static void main(String[] args) {
		String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};
		for (String[] strings : arr) {
			for (String string : strings) {
				System.out.print(string + " ");
			}
		}
	}

}

//What is the result?
//A. A B C
//B.	A B C D E
//C.	A B D E
//D.	Compilation fails.


//continue; cannot be used outside of a loop
//break; cannot be used outside of a loop
