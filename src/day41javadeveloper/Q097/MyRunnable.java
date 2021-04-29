package day41javadeveloper.Q097;


//ANSWER A,C

//A functional interface in Java is an interface that contains only a single abstract (unimplemented)
//method. A functional interface can contain default and static methods which do have an implementation,
//in addition to the single unimplemented method.


//A
@FunctionalInterface
public interface MyRunnable {

	public void run();

}

//B
//@FunctionalInterface
//public interface MyRunnable {
//
//	public void run();
//	public void call();
//
//}


//C
//@FunctionalInterface
//public interface MyRunnable {
//
//	public default void run() {}
//	public void run(String s);
//
//}

//D
//@FunctionalInterface
//public interface MyRunnable {
//
//}


//E
//public interface MyRunnable {
//	@FunctionalInterface
//	public void run();
//
//}