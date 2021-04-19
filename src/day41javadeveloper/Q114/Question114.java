package Q114;

import java.util.Comparator;

public class Question114 {
	
	/*ANSWER D
	 * 
	 * 
	 * Which code fragman compiles?
	 * A. Option A 
	 * B. Option B 
	 * C. Option C 
	 * D. Option D
	 */

	public static void main(String[] args) {
		
		//A
//		Comparator comparator= new Comparator<?>() {
//			public int compare(Integer i, Integer j) {
//				return i.compareTo(j);
//			}
//		};
		
		//B
//		var comparator= new Comparator<>() {
//		public int compare(Integer i, Integer j) {
//			return i.compareTo(j);
//		}
//	};
		
		//C
//		Comparator<> comparator= new Comparator<Integer>() {
//		public int compare(Integer i, Integer j) {
//			return i.compareTo(j);
//		}
//	};
		
		
		//D
		Comparator<Integer> comparator= new Comparator<>() {
		public int compare(Integer i, Integer j) {
			return i.compareTo(j);
		}
	};
		
	}

}
