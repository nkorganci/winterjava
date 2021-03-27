package p01_W3resource;

public class Q15_SwapingNumbers {

    public static void main(String[] args) {

	// First Method

	int a = 1;
	int b = 2;
	int temp = 3;

	System.out.println("Before swapping : " + "a = " + a + ", " + "b = " + b);

	temp = a; // there is no any more a, it is transferred to temp.
	a = b; // a rec
	b = temp;

	System.out.println("After swapping :  " + "a = " + a + ", " + "b = " + b);

	// Second Method

	int c = 1;
	int d = 3;

	System.out.println("Before swapping : " + "c = " + c + ", " + "d = " + d);

	c = c + d;
	d = c - d; // c+d-d; result c
	c = c - d; // c+d-( (c+d)-d); result d

	System.out.println("After swapping : " + "c = " + c + ", " + "d = " + d);

    }

}
