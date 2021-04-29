package day41javadeveloper.Q053;

public class Foo {

	Foo(String a){
		System.out.println(a + "constructro");
	}

	void print() {
		System.out.println("Bonjour le monde!");
	}
	public void foo() {
		print();
	}
}

class Bar extends Foo {

	Bar(){
		super("Hi ");
	}
	void print() {
		System.out.println("Hello world!");
	}
	public void bar() {
		print();
	}

	public static void main(String... args) {
		Bar b= new Bar();
		b.foo();
		b.bar();
	}

}
/*What is the output?
A. Hello world!Bonjour le monde!
B. Hello world!Hello world!                   answer c
C. Bonjour le monde!Hello world!
D. Bonjour le monde!Bonjour le monde!*/