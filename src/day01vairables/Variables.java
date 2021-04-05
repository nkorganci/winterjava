package day01vairables;

public class Variables {
	/*
	1-Variables are reserved area in memory, you create a container for each variable, "int a;" created a container.
	2- When you assign a value, it will go to container.
	3- All non primitive types are in same size.
	4- int is default data type for integers. Double is default for decimal values.
	5- There are 8 primitive data types: boolean,char,byte,short,int,long,float(decimal, must add f),double(decimal)
    6- There are lots of non-primitive types.(objects, classes...)
    7- Primitive data types has only value in container but non primitive types has both value and methods.
	 */

    boolean aBoolean;
    char aChar;
    byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    String aString;

    public static void main(String[] args) {

        //3- Default values of primitive data types

        // defaultValuesOfVariables();
//        primitiveNonPrimitiveDataTypesSizes1();
//
//        displaySizeMinAndMax(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
//        displaySizeMinAndMax(Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
//        displaySizeMinAndMax(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
//        displaySizeMinAndMax(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
//        displaySizeMinAndMax(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
//        displaySizeMinAndMax(Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
//        displaySizeMinAndMax(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);

        asciiValues();

    }

    public static void dataTypes() {
        int age = 27;//Initialization of variable
        System.out.println(age);
        int age1; //Declaration of variable, age is not used this is why it is not bold.

        short sh = 2;
        short sh2 = (short) 444444;

        long ln = 23324;

        float fl = 2.3f;// you have to write f at the end
        float fl2 = 2343f;

        double d1 = 3.343;
        double d2 = 4324234;// does not complain because it also contain long or integer

        boolean isGood = true;
        char initial = 'S';
        String name = "Ali can";
        System.out.println();

        // 2. Concatenation
        System.out.println("I love" + ' ' + "Java");
        System.out.println(2 + 3 + "a"); // Start from the left to right

        //Non-primitive data types: String
        String a = "hello";
        System.out.println(a.length());//I can get length

        int z = 2;
        //System.out.println(z.);// Nothing is coming after writing "z."


    }

    public static void asciiValues() {

        // 1.Char value of characters
        int a = 'a'; // shows ascii value
        System.out.println(a);
        int b = 'b';
        System.out.println(a + b);// add ascii values

        //2- Char value
        char ch11 = '4';

        System.out.println(ch11);//it writes only character
        System.out.println('4');//it writes only character

        //3- Ascii value

        int int11 = '4';
        System.out.println(int11);

        //In order to find ascii value you need to assign it to integer or cast to integer
        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);

        char ch1 = '$';
        int ascii1 = ch1;
        // You can also cast char to int
        int castAscii1 = (int) ch1;

        System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);
        System.out.println("The ASCII value of " + ch1 + " is: " + castAscii1);


    }

    public static void defaultValuesOfVariables() {

        Variables obj = new Variables();

        System.out.println("Default value of boolean: " + obj.aBoolean);
        System.out.println("Default value of char: " + obj.aChar);
        System.out.println('\u0000');//default value of a char is empty
        System.out.println("Default value of byte: " + obj.aByte);
        System.out.println("Default value of short: " + obj.aShort);
        System.out.println("Default value of int: " + obj.anInt);
        System.out.println("Default value of long: " + obj.aLong);
        System.out.println("Default value of float: " + obj.aFloat);
        System.out.println("Default value of double: " + obj.aDouble);
        System.out.println("Default value of String: " + obj.aString);

    }

    public static void primitiveNonPrimitiveDataTypesSizes1() {


        /*
        type:byte   size:8  min:-128                 max:127
        type:short  size:16 min:-32768               max:32767
        type:char   size:16 min:0                    max:65535
        type:int    size:32 min:-2147483648          max:2147483647
        type:long   size:64 min:-9223372036854775808 max:9223372036854775807
        type:float  size:32 min:1.4E-45              max:3.4028235E38
        type:double size:64 min:4.9E-324             max:1.7976931348623157E308
         */

        //1- Character
        System.out.println(Character.MAX_VALUE + 0);//65535
        System.out.println(Character.MIN_VALUE + 0);//0

        //2- Byte
        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128

        //3- Short
        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768

        //4- Integer
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

        //5- Long
        System.out.println(Long.MAX_VALUE);//9223372036854775807
        System.out.println(Long.MIN_VALUE);//-9223372036854775808

        //6- Float
        System.out.println(Float.MAX_VALUE);//3.4028235E38
        System.out.println(Float.MIN_VALUE);//1.4E-45

        //7- Double
        System.out.println(Double.MAX_VALUE);//1.7976931348623157E308
        System.out.println(Double.MIN_VALUE);//4.9E-324

    }

    public static void displaySizeMinAndMax(Class<?> type, int size, Number min, Number max) {
        System.out.printf("type:%-6s size:%-2s min:%-20s max:%s\n", type, size, min, max);

    }

    public static void memoriesStackHeap(){

        /*
        1- Slack memory contain data type values and references of objects(non-primitive data types like String)
        2- Heap memory is used to store objects in java.
        3- Slack memory is very small relative to heap memory
         */
    }
}
