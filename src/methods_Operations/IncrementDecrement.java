package methods_Operations;

public class IncrementDecrement {

    public static void main(String[] args) {

	// 1.Post Increment/decrement x++, x--:
	// a) It increases/decreases by 1 after the loop,
	// b) x++ increases by 1 whenever it is written again even in
	// system.out.println(x)

	int x = 1;
	int y = 1;

//	for (int i = 0; i < 1; i++, x++, y++) {
//
//	    x++;
//	    y++;
//	    System.out.println(x);
//	    System.out.println(y);
//
//	}
//
//	System.out.println(x);
//	System.out.println(y);

	// 2.Pre Increment/decrement ++x, --x:

	for (int i = 0; i < 1; i++, ++x, ++y) {

//	    ++x;
//	    ++y;
	    x++;
	    y++;

	    System.out.println(x);
	    System.out.println(y);

	}
//	++x;
//	++y;
	System.out.println(x);
	System.out.println(y);

    }

}
