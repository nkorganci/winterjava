package day02scanner;

import java.util.Scanner;

public class ScannerClass01 {

    /*
     * 1) Type ==> Scanner scan = new Scanner(System.in);
     * 2- Scanner is used to get input from user
     * 3- Java has library which contain huge number of classes
     * 4- "new" is a kind of import or calling a class, creating an object.
     * 5- System.in means, getting data from outside into your code.
     * 6- Only char and String has no scan.next... method.
     * 7- Always use parenthesis for calculations
     * 8- scan.next() gets first element(word), scan.nextLine() gets full String
     */

    public static void main(String[] args) {
        firstCharactersOfName();
    }

    public static void scanner01() {
        // New always create a new object.
        // scan variable name is used generally by programmers.
        Scanner scan = new Scanner(System.in);

        System.out.println("write a number");

        int num1 = scan.nextInt();
        System.out.println(num1);

        System.out.println("write the secondnumber");
        int num2 = scan.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 - num2);

    }

    public static void areaOfSquare() {

                /*
             Type a program which calculates the area and the perimeter of a square
            whose side length is entered by user.
            Hint 1: Area of a square is length x length
            Hint 2: Perimeter of a square is 4x length
             */
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the lenght of the square: ");
        int length = scan.nextInt();//if user write double,change it do double

        System.out.println("Area: " + length * length);


    }

    public static void areaOfRectangle() {
        	/*
	Type a program which calculates the area and the perimeter of a rectangle
		whose length and with are entered by user.
	Hint 1: Area of a rectangle is width x length
	Hint 2: Perimeter of a rectangle is 2x (width + length)
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Write the lenght of the rectangle: ");
        double length = scan.nextDouble();

        System.out.println("Write the width of the rectangle: ");
        double width = scan.nextDouble();

        System.out.println("Area of rectangle is: " + length * width);
    }

    public static void firstLastName() {
        /*
          Type a program which asks user first name and last name then print it on the console
         */

        /*
        next(): the next token, it stops whenit see a space character in String
        nextLine(): the line that was skipped
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        // if you wanna get a string data from user, usenextLine() method which gets
        // full String
        String fullName = scan.nextLine();
        System.out.println("Your full name is " + fullName);

        System.out.println("Write your kid's first name");
        //If you wanna get a String data which gets only first word.
        String kidFirstName = scan.next();
        System.out.println("Your kid's frist name is " + kidFirstName);


    }

    public static void familyNames() {
        		/*
		 ask user his/her full name, spouse's name, address, write all in consoule
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your full name please");
        String fullName = scan.nextLine();

        System.out.println("Write your spouse's name");
        String spouseName = scan.next();

        scan.nextLine(); // after using nextline(), if you use any other method, you type scan.nextLine(); again.

        System.out.println("Write your address please");
        String address = scan.nextLine();

        String spousesName;
        System.out.println("Your name is " + fullName + "Your spouses name is " +
                spouseName + "Your address is " + address);
    }

    public static void firstCharactersOfName(){

        /*
        User will enter his/her first and last name, you will print the first character on console
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Write your first name: ");
        char firstNameInitial = scan.nextLine().charAt(0);

        System.out.println("Write your last name: ");
        char lastNameInitial = scan.nextLine().charAt(0);

        //1st Way: use String at the beginning or between each other
        System.out.println(firstNameInitial + " " + lastNameInitial);

        //2nd Way: use System.out.print()
        System.out.print(firstNameInitial);
        System.out.println(lastNameInitial);

        // If you write a character in operation ,ASCII value will be used as a number. Mathematical calculation.
        System.out.println(firstNameInitial + lastNameInitial);
        System.out.println(firstNameInitial * lastNameInitial);



    } //charAt(int index), Returns the char value at the specified index
}
