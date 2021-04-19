package day41javadeveloper.Q033;

public class Test {
	
	/**
	 * 
	 * What is the result?
	 * A.A ClassCastException is thrown at run time
	 * B. AnotherClass# methodA()AnotherClass#methodA()
	 * C. Compilation fails.
	 * D. SomeClass# methodA()AnotherClass#methodA()
	 * E. AnotherClass#methodA()SomeClass#methodA()
	 * F. SomeClass#methodA()SomeClass#methodA()
	 */
	
	public static void main(String[] args) {
		
		AnotherClass ac = new AnotherClass();
		SomeClass sc = new AnotherClass();
		ac = (AnotherClass) sc;
		sc.methodA();
		ac.methodA();
	
		
	}

}


