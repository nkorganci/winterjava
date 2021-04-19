package Q112;

import java.util.concurrent.locks.ReentrantLock;


/*ANSWER is C
 * 
 * 
 * What is required to make the Foo class thread safe? 
 * A. No change is required.
 * B. Make the declaration of lock static.
   C. Replace the lock constructor call with new ReentrantLock (true). 
   D. Move the declaration of lock inside the foo method.
 * 
 */

public class Foo {
	
	private final ReentrantLock lock = new ReentrantLock();
	private State state;
	public void foo() throws Exception{
		try {
			lock.lock();
			state.mutate();
		}
		
		finally {
			lock.unlock();
		}
	}
	

}
