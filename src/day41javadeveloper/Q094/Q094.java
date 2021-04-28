package day41javadeveloper.Q094;

public class Q094 {

	public static void main(String[] args) {
		for (var i=0;i<10; i++){
			//System.out.println(i%5);
			
			switch(i%5) {
			case 2:
			i*=i;
			break;
			
			case 3:
				i++;
			break;
			case 1:
			
			case 4:
				i++;
				
				continue;
			default:
			break;
		}
			System.out.println(i+ " ");
			
     i++;
	}
		
/*What is the result?
A. nothing 
B. 0
C. 10
D. 0 4 9
Cevap D*/

}}
