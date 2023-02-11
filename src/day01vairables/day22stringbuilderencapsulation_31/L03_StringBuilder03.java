package day01vairables.day22stringbuilderencapsulation_31;

public class L03_StringBuilder03 {
    /*
     * StringBuffer and StringBuilder has same features.
     * StringBuffer has more features so it works slowly String is immutable,
     * JVM needs to create new container,
     * StringBuilder is created to update Strings easily but java made
     * the StringBuffer thread-safe and synchronized but Thread-safe means multithread
     */

    public static void main(String[] args) {
	speedofStringBufferBuilder();

    }

    public static void singlemultithreadingStringBuffer() {

	/*
	 * String is immutable, because of that when you want to update a String JVM
	 * needs to do many tasks like creating a new container, putting the updated
	 * value into it then remove the previous String object
	 */
	String str = "Java";
	str.concat("X");

	/*
	 * StringBuffer is created to update Strings easily but Java made the
	 * StringBuffer thread-safe and synchronized but that features made the
	 * StringBuffer slow. Then Java created StringBuilder which is not thread-safe
	 * and not synchronized. So it worked faster than StringBuffer
	 */
	StringBuffer sbf = new StringBuffer("Java");
	sbf.insert(4, "X");
	System.out.println(sbf);// JavaX

	/*
	 * As a result; if you are sure you will not need multithreading or
	 * synchronization just single threading is enough for you use StringBuilder
	 * when you need to update a String. But if it is possible you will use
	 * multithreading use StringBuffer
	 */
	StringBuilder sb = new StringBuilder("Java");
	sb.insert(4, "X");
	System.out.println(sb);// JavaX

    }

    public static void speedofStringBufferBuilder() {
	long startTime = System.currentTimeMillis();
	StringBuffer sb = new StringBuffer("Java");
	for (int i = 0; i < 10000; i++) {
	    sb.append("Tpoint");
	}
	System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	startTime = System.currentTimeMillis();
	StringBuilder sb2 = new StringBuilder("Java");
	for (int i = 0; i < 10000; i++) {
	    sb2.append("Tpoint");
	}
	System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }

}
