package day41javadeveloper;

public class Q029InternStringMethod {
	
	public static void main(String[] args) {
		String s1= new String("ORACLE");
		String s2="ORACLE";
		String s3=s1.intern();	
		System.out.println((s1==s2));
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		
		
	}
	
	
	

}


/*When the intern method is invoked, if the pool already contains a string equal to 
 this String object as determined by the equals(Object) method, 
 then the string from the pool is returned. Otherwise, this String object is added
to the pool and a reference to this String object is returned.

It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.*/

//The method intern() creates an exact copy of a String object in the heap memory and stores
//it in the String constant pool. Note that, if another String with the same contents exists 
//in the String constant pool, then a new object won't be created and the new reference will point to the other String.

//What is the result?
//A. false true true 
//B. true false false 
//C. false false true 
//D. false true false

//Cevap D