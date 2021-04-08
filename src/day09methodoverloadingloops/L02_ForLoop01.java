package day09methodoverloadingloops;

public class L02_ForLoop01 {

	//If second condition is correct loop will work.

    public static void main(String[] args) {
	printHello();
	decrease();

    }

    // Type code to print "Hello World! 10 times
    public static void printHello() {
	System.out.println("Hello World!");

	for (int i=1; i<=10; i++){
		System.out.println("Hello World");

		}
    }

    public static void decrease(){
    	for (int i=12; i>=5; i--){
			System.out.print(" " + i);
		}
	}

}
