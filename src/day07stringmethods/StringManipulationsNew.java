package day07stringmethods;

import java.util.Scanner;


public class StringManipulationsNew {
    public static void main(String[] args) {

     valueOf();

    }

    public static void contains() {
        /*
         Ask user to give you a String and a character If the character does not
         exist in the string or exists just once print "Not Good"
         If the character is used  multiple times print "Woow"
         */

         /*
         1- contains () is used to check if a single character or multiple charactes exist in a String
         2- contains can not contain chars, you have to use String. contain methods return BOOLEAN

          */

        String rString = "Learn Java, earn money";
        System.out.println(rString.contains("e"));
        System.out.println(rString.contains("Java"));
    }//boolean contains(CharSequence s)

    public static void endStartWith() {
        // STRING METHOD: endsWidth() is used to check the last character in a String
        // is used with only String, not a character, it returns boolean

        String str = "Java is java";

        System.out.println(str.endsWith("a"));// true
        System.out.println(str.endsWith("f"));// false
        System.out.println(str.endsWith("ava"));// true
        System.out.println(str.endsWith("naava"));// false

        // endWidth() check the last character/s in a String

        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("Javs")); // false
        System.out.println(str.startsWith("i", 5));// true, check the char at 5.
    }//boolean endsWith(String suffix)

    public static void equals() {
        // If you get a data from user, it will create a new string, not from String
        // pool
        String a = "Java";
        String b = "Java";

        String c = new String("Java");
        String f = "jav" + "a";// Origin is "Jav"

        Scanner scan = new Scanner(System.in);
        System.out.println("Write java: ");
        String g = scan.next();// Creates new container.

        System.out.println(a == b);// true, because java use String pool for same values(it also has same
        // refereceF)
        System.out.println(a == c);// false, c is created as new container, difference box and reference
        System.out.println(a == f);// same values but different references
        System.out.println(a.equals(f));


    }
    public static void equals1() {
        int a = 2;
        int b = 2;
        System.out.println(a == b);// true, "==" for primitive, this is an operator,compare, references

        // Comparison of two string, not object
        String c = "2";
        String d = "2";
        System.out.println(c == d);// true, "==" for String
        System.out.println(c.equals(d));// true, "equals" for string,equals() is a method

        // Comparison of an object and string copy
        String e = new String();
        e = "2";
        String f = new String();
        f = "2";
        System.out.println(e == f);// "==" for String
        System.out.println(e.equals(f));// "equals" for string

        // compare two objects
        String g = new String("2");// Object 1,same values but different references
        String h = new String("2");// Object 2
        System.out.println(g == h);// return false, 2 object, 2 references
        System.out.println(g.equals(h));// return true, same values

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;

        String s1 = new String("GEEKS");
        String s2 = new String("GEEKS");

        String s3 = "GEEKS";

        System.out.println(s3 == s1);
        System.out.println(s3.equals(s1));

        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(s1 == s2);

        System.out.println(t1.equals(t2));
        System.out.println(s1.equals(s2));

    }

    public static void indexOf1() {// int indexOf(int ch)
        //Returns:
        //the index of the first occurrence of the character in the character sequence represented by this object,
        // or -1 if the character does not occur.

        String str = "012 456 89";
        System.out.println(str.indexOf('4'));
        System.out.println(str.indexOf(str));// return 0
        System.out.println(str.indexOf('z'));// return -1

    }// int indexOf(int ch)

    public static void indexOf2() {// METHOD 2 indexOf(String str)
        // returns index of given character value or substring. If it is not found, it
        // returns -1

        String str = "012 456 89";
        System.out.println(str.indexOf("456")); // returns the index of beginning of 456 substring
    }//int indexOf(String str)

    public static void indexOf3() {// METHOD 3 indexOf(int char, int fromIndex):

        // Returns the index within this string of the first occurrence of the specified
        // character
        String str = "012 456 89 012 456 89";
        System.out.println(str.indexOf('4', 5));
    }// indexOf(int char, int fromIndex):

    public static void indexOf4() {//  indexOf(String str, int fromIndex);

        String str = "012 456 89 012 456 89";
        String str1 = "Hi how how are are you";

        System.out.println(str1.indexOf("ow", 1));


    }//  indexOf(String str, int fromIndex);

    public static void indexOfExample05() {
        /*
         * Ask user to enter a String and a character, then check if the String has THAT
         * character or not.
         */

        Scanner s = new Scanner(System.in);

        System.out.println("Write a text: ");
        String iString = s.nextLine();

        System.out.println("Write a character: ");
        char ch = s.next().charAt(0);

        if (iString.indexOf(ch) != -1) {
            System.out.println("we have this character");
        } else {
            System.out.println("there is no such character");

        }
    }

    public static void isEmptyIsBlank() {
        String str = "Java is java";

        // isEmpty() is used to check if a String has zero character or not, returns true or false

        System.out.println(str.isEmpty()); // false
        String str2 = "";
        System.out.println(str2.isEmpty()); // true

        //Returns true if the string is empty or contains only white space codepoints, otherwise false.
        //indexOfNonWhitespace() == length()
        System.out.println(str.isBlank());
        System.out.println(str2.isBlank());

    }// Returns: true if length() is 0, otherwise false.

    public static void lastIndexOf() {

        //Returns the index within this string of the last occurrence of the specified character,
        // searching backward starting at the specified index.

        String input = "0113477799";

        System.out.println(input.lastIndexOf('9'));
        System.out.println(input.lastIndexOf("1"));
        System.out.println(input.lastIndexOf("1", 6));
        System.out.println(input.lastIndexOf("11"));

        // METHOD: lastIndexOf() returns the index of last occurence of the character
        String t = "0123456996789";

        // In lastIndexOf() method you can use char and String. Both are acceptable
        System.out.println(t.lastIndexOf('5'));// 11
        System.out.println(t.lastIndexOf("3"));// 11

        // lastIndexOf() method returns -1, if the character does not exist in the
        // String
        System.out.println(t.lastIndexOf("w"));// -1

        // lastIndexOf() returns the index of first character of last occurence of
        // "Java"
        System.out.println(t.lastIndexOf("23"));// 8

        // If you use lastIndexOf() with 2 parameters, get the character starting with
        // the index and to the begining of the String
        // In the following example we are usen "Java a"
        System.out.println(t.lastIndexOf("9", 5));

    }//int lastIndexOf(int ch)

    public static void parseInt01() {// Integer.parseInt(String,radix)
        // It is basically used to convert binary to integer, octal to integer
        // Radix means root or base

        // Binary to decimal conversion
        System.out.println(Integer.parseInt("110", 2));
        System.out.println(Integer.parseInt("101010"));

        // String to decimal conversion
        System.out.println(Integer.parseInt("6B", 15));

    }

    public static void replace1() {// METHOD 1: replace(char oldChar, char newChar)
        // returns a string from replacing all occurrences of oldChar in this
        // string with newChar

        // Returns: a string derived from this string by replacing every occurrence of oldChar with newChar.
        String s1 = "javatpoint is a very good website";
        String replaceString = s1.replace('a', 'e');// replaces all occurrences of 'a' to 'e'
        String replaceString1 = s1.replace("a", "e");// replaces all occurrences of 'a' to 'e'
        System.out.println(replaceString);

        String str = "Hello Hello World";
        str = str.replace('H', ' ');// There is no empty char, you can not write ''
        System.out.println(str);
        System.out.println(str.replace('H', ' '));
    }// String replace(char oldChar, char newChar)

    public static void replace2() {// METHOD 2: replace(CharSequence target, CharSequence replacement)

        // replace all occurrences of a given substring 'target' in string with a new substring code
        //

        String s1 = "my name is aa my name is java";
        String replaceString = s1.replace("is", "was");// replaces all occurrences of "is" to "was"
        System.out.println(replaceString);
    }// String replace(CharSequence target, CharSequence replacement)

    public static void replaceAll1() {// METHOD 1: replaceAll(String regex, String replacement)

        String s1 = "javatpoint is a very good website";
        String replaceString = s1.replaceAll("a", "e");// replaces all occurrences of "a" to "e"
        System.out.println(replaceString);

        // replaceAll: you can not use char, in replace method you can use char
        // replaceAll: you can use regular expressions

        System.out.println(s1.replaceAll("a", "m"));
    } // String replaceAll(String regex, String replacement)

    public static void replaceAll2() {// METHOD 2: replaceAll(String regex, String replacement)

        String s1 = "My name is Khan. My name is Bob. My name is Sonoo.";
        String replaceString = s1.replaceAll("is", "was");// replaces all occurrences of "is" to "was"
        System.out.println(replaceString);

    }

    public static void replaceAll3() {// METHOD 3 replaceAll(String regex, String replacement)
        /*
        1- replaceAll: can not use chars
        2- replaceAll: can use regular expressions.
         */

        String s1 = "My name is Khan. My name is Bob. My name is Sonoo.";
        String replaceString = s1.replaceAll("\\s", "");// remove all the occurrences of white spaces.
        System.out.println(replaceString);
    }//replaceAll("\\s", "");// remove all the occurrences of white spaces.

    public static void replaceFirst() {
        String str3 = "Java123 learn, earn_money!!  .";

        // replaceFirst() changes just the first occurence of the character

        System.out.println(str3.replaceFirst("a", "x"));

    }//String replaceFirst(String regex, String replacement)

    public static void substring() {

        //
        String str4 = "Java is the best";

        System.out.println(str4.substring(3));// it start to cut from index number 3.
        System.out.println(str4.substring(15));// 16 is inclusive

        System.out.println(str4.subSequence(1, 5)); //return this.substring(beginIndex, endIndex)
        System.out.println(str4.substring(1, 5)); //endIndex is exclusive, beginIndex is inclusive

        System.out.println(str4.substring(2, 3));// you will get a character
        System.out.println(str4.substring(2, 2));// you will get nothing

        System.out.println(str4.length());// length is 16
        System.out.println(str4.substring(15));//t which is the last char
        System.out.println(str4.substring(16));// If you write the length , you will get nothing
//        System.out.println(str4.substring(17));// If you write bigger than length , outOfBoundsException, -1
//        System.out.println(str4.substring(18));// If you write bigger than length , outOfBoundsException, -2

    } //String substring(int beginIndex)

    public static void substringExample() {
        /*
         * Ask user to enter a string if the 1st and the last char of the string are
         * same print "Woow" on the console, otherwise, print "Hmm"
         */

        //1st Way
        String str = "HiiiH";
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("First and last characters are same");
        } else {
            System.out.println("First and last chars are not same");
        }

        //2nd Way

        String firstCh = str.substring(0, 1);
        String lastCh = str.substring(str.length() - 1);

        if (firstCh.equals(lastCh)) {
            System.out.println("First and last characters are same");
        } else {
            System.out.println("First and last chars are not same");
        }


    } // String substring(int beginIndex, int endIndex(exclusive))

    public static void errorTypes() {
        /*
         1) CTE: While you are writing a code, you may get red underline which is called Compile time error.
         2) RTE: When you run the Code you you may not see red underlined but after you run, you may see red
         text which is called runtime error
         */
    }

    public static void charAt() {
        // 1.charAt()

        String str = "1234567891";

        char ch1 = str.charAt(0);
        System.out.println(ch1);
        // Return 1st character of str

        char ch6 = str.charAt(6);
        System.out.println(ch6);
        // Return 7th character of str

        // char ch10 = str.charAt(10);
        // System.out.println(ch10);
        // If index which is greater than length()-1, return IndexOutOfBoundsException

        // char chN = str.charAt(-1);
        // System.out.println(chN);
        // negative index return IndexOutOfBoundsException

        // for (int i = 0; i < str.length(); i++) {
        // System.out.print(str.charAt(i));
        // print all characters of string

        //How many same character are there in the same text
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '1') {
                count++;

            }

        }
        System.out.println("1 is counted " + count + " times");

    } //char charAt(int index)

    public static void comparedTo() {

        // https://www.youtube.com/watch?v=iTC43mLZG38
        // It checks value of characters when they are not equal in letters to each
        // other.

        String str1 = "ab";
        String str2 = "";
        // This is an empty string
        String str3 = "abc";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str1.compareTo(str3));

        String s1 = "BEGINNERSBOOK"; // uppercase
        String s2 = "beginnersBOOK"; // mixedcase

        System.out.println(s1.compareTo(s2)); // this would return non-zero value, -32
        System.out.println(s1.compareToIgnoreCase(s2));// this would return zero, 0


    } // int compareTo(String anotherString)

    public static void trim() {
         /*

         METHOD: trim()
         It returns a String after removing ONLY leading and trailing white spaces
         from the input String, does not remove middle ones
          */

        String a = "     Hi   Hello   ";
        System.out.println(a);//     Hi   Hello
        System.out.println(a.length());

        System.out.println(a.trim());//Hi   Hello
        System.out.println(a.length());// I did not assign so its length did not change, length 18

        String c = a.trim();
        System.out.println(c.length());// length has changed to 10.
    }

    public static void hashCodee() {
        String a = "Hello";
        String b = "Hello";
        String c = "hello";
        if (a.hashCode() == c.hashCode()) {
            System.out.println("Same words");
        } else {
            System.out.println("They are not same");

        }
    }

    public static void concat() {

        String a = "Hi";
        String b = "Hello";
        String c = a.concat(b).concat("Added");
        System.out.println(c);
    }

    public static void parseInt() {

        //ParseInt convert string to integer if String has only numbers.
        //Find the sum of the Strings

        String str1 = "$12.99";
        String str2 = "$8.00";

        String a = str1.replaceAll("\\D", "");
        String b = str2.replaceAll("\\D", "");
        System.out.println(a);
        System.out.println(b);

        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        System.out.println(c + d);

    }//int parseInt(String s) throws NumberFormatException, This returns an integer (decimal only).

    public static void parseInt011() {
        /*
         This returns an integer, given a string representation of decimal, binary, octal, or hexadecimal
         (radix equals 10, 2, 8, or 16 respectively) numbers as input.
         */

        int b = Integer.parseInt("444", 10);
        System.out.println(b);

    }//parseInt(int i)

    public static void valueOf() {
        String str1 = "1299";
        String str2 = "800";

        int a = Integer.valueOf(str1);
        System.out.println(a);

        int b = Integer.valueOf(2);
        System.out.println(b);

        int c = Integer.valueOf("40",4);
        System.out.println(c);

    } //Integer valueOf(String s) throws NumberFormatException,
    // Returns an Integer object holding the value of the specified String.

    public static void s637() {

    }

}
