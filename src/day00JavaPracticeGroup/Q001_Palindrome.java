package day00JavaPracticeGroup;

import java.util.stream.IntStream;

/*
Q_1 )   Given a list of strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters.

	Q_2 )   Write a method that returns a comma-separated string based on a given list of integers.
 			Each element should be preceded by the letter 'e' if the number is even,
 			and preceded by the letter 'o' if the number is odd.
 			For example, if the input list is (3,44,46,57), the output should be 'o3,e44,e46,o57'.

 	Q_3 )   Write a program that prompts the user to enter values, obtain their average, and displays the number of values greater than the average.

 	Q_4 )   Write a method that returns true if a given number is palindrome, returns false otherwise ( Optional )
			For example 121 --> true ; 123 --> false


	Q_1 )  String[] names = { "John", "Peter", "Susan","George", "Alan", "Michelle", "Steve", "Stacy", "Kim", "Jen", "john", "susan"};

 		   i.Find if all names starts with a capital letter. (Print true or false accordingly)
 		  ii.Sort the names in reverse order ( without case-sensitivity)

 	Q_2 ) String text = "Good morning. Have a good class. Have a good visit. Have fun!";

 		  Write a program that counts the occurrences of words in the String ( without case-sensitivity )

 	Q_3 )  Write a program that prompts the user to enter numbers. Put them in a list. Then prints each integer with their occurrences.
 */

public class Q001_Palindrome {
    /*
    Q_4 )   Write a method that returns true if a given number is palindrome, returns false otherwise ( Optional )
			For example 121 --> true ; 123 --> false
     */

    public static void main(String[] args) {

        System.out.println(palindrome(232));

    }

    public static boolean palindrome(int i){

        return i== IntStream.iterate(i, n->n!=0, m->m/10).map(n->n%10).
                reduce(0, (x,y)->x*10+y);
    }


}
