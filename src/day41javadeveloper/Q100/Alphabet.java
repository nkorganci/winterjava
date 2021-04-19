package day41javadeveloper.Q100;


//ANSWER C

/*
 * 
 * Examine this code: 
 * System.out.println(Alphabet.getFirstLetter());

What code should be written at line 3 to make this code print A?

A. final String getFirstLetter() { return A.toString(); }
B. static String getFirstLetter() { return Alphabet.values()[1].toString(); } 
C. static String getFirstLetter() { return A.toString(); }
D. String getFirstLetter() { return A.toString(); }
 * 
 */


public enum Alphabet {
	
	A, B, C;
	
	static String getFirstLetter() { return A.toString(); }


}
