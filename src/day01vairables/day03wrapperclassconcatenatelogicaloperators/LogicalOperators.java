package day01vairables.day03wrapperclassconcatenatelogicaloperators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		/* Assignment operator, comparison operation,logical operator.
		 Operators in Java


		 
		 1) = is assignment operator, gets the value from right and puts
		 it in to container on the left. 
		 int a = 2; // correct
		 3 = 2 + 1; // wrong
		 
		 2) == is means equal, returns boolean.
		       5 == 2 + 3
		       
		 3) != means "Not equal", returns boolean
		 
		 4) > means greater than, returns boolean
		 
		 	COMPARISONS return Boolean
		 
		 5) && AND Operator; returns false if one of them is false
		 	|| OR operator; returns false if both of them are false
		 
		 6) & AND Operator is SAME WITH &&, but there is a small differences,
		 	&&: if one of them is false , it does not look at others, &: it checks
		 	all parameters;
		 
		  
		 */
		
		System.out.println( 2 == 3); // return FALSE
		System.out.println( 2 == 2); // return TRUE
		// System.out.println(8 !<4 ); did not work, there is no such operator
		
		System.out.println( 2 == 3 || 2>3 || 5<9);
		System.out.println( 2 == 3 && 5<9 && 2==34);// This is faster
		System.out.println( 2 == 3 & 5<9 & 2==34); // slower than previous
		
		

	}

}
