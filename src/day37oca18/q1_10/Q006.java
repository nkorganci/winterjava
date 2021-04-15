package day37oca18.q1_10;

public class Q006 {
	static int i;  // static fields gets changed for every object
	int j;
	public static void main(String[] args) {
		Q006 q0061 = new Q006();
		Q006 q0062 = new Q006();
		q0061.i= 3;
		q0061.j = 4;
		q0062.i= 5;
		q0062.j = 6;
		System.out.println(
				q0061.i + " " +
				q0061.j + " " +
				q0062.i + " " +
				q0062.j);
	}

	public void printFileContent() {
	}
}
//What is the result?
//A.-3 4 5 6
//B.3 4 3 6
//C.5 4 5 6
//D.3 6 4 6
