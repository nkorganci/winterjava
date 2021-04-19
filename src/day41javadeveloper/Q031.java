package day41javadeveloper;

public class Q031 {


	public static void main(String[] args) {
		
		int x=0;
				while(x<10) {
					System.out.print(x++);  //0123456789
				}
				
		//WHICH "for" LOOP PRODUCES THE SAME OUTPUT
				//ANSWER IS C
				
				
		System.out.println();		
		
		
		//A		012345678910
		int b=0;
		for(;b<10;) {
			System.out.print(++b);
		}
		System.out.println();
		
		
		//B compilation fails because a isn't defined and initialized if it was for(int a =0;a<10;a++)
		//it would give the same output
		
		
//		for( a;a<10;a++) {
//			System.out.print(a);
//		}
//		System.out.println();
		
		
		//C  0123456789
		
		for(int d=0;d<10;) {
			System.out.print(d);
			++d;
		}
		System.out.println();
		
		
		
		//D  012345678910  
		for(int c=0; ; c++) {
			System.out.print(c);
			if(c==10) {
				break;
			}
		}
	}
}
