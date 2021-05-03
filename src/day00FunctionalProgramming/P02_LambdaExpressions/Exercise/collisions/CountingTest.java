package day00FunctionalProgramming.P02_LambdaExpressions.Exercise.collisions;

import java.util.ArrayList;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Consumer;

public class CountingTest {

	
	public static final int XRES = 1920, YRES = 1080, MAXX = 200, MAXY = 200;

	
	// Generate random boxes
	public static ArrayList<Box> makeRandom(int n) {
		ArrayList<Box> result = new ArrayList<>(n);
		for (int i=0; i<n; i++)
			result.add(Box.newRandom(XRES, YRES, MAXX, MAXY));
		return result;
	}
	
	
	
	public static void main(String[] args) {
		final int TEST_SIZE = 5_000;
		ArrayList<Box> world = makeRandom(TEST_SIZE);
	
		
		System.out.println("\nCounting the number of collisions:");
		
		final LongAdder atomicCounter = new LongAdder();
		Consumer<Collision> action = c -> atomicCounter.increment();

		
		System.out.println("\nStandard imperative");
		// Warm up
		BasicDetection.forEachCollision1(world, action);
		atomicCounter.reset();
		// Timed run
		Time.timeIt(() -> BasicDetection.forEachCollision1(world, action));
		System.out.println("# of collisions: " + atomicCounter);

		
		System.out.println("\nStandard imperative (no duplicates)");
		// Warm up
		BasicDetection.forEachCollision2(world, action);
		atomicCounter.reset();
		// Timed run				
		Time.timeIt(() -> BasicDetection.forEachCollision2(world, action));
		System.out.println("# of collisions: " + atomicCounter);


		System.out.println("\nParallel stream (ForEachCollisionCollector)");
		// Warm up
		BasicDetection.forEachCollision3(world, action);
		atomicCounter.reset();
		// Timed run
		Time.timeIt(() -> BasicDetection.forEachCollision3(world, action));
		System.out.println("# of collisions: " + atomicCounter);
	}

}
