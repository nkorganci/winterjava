package day41javadeveloper.Q091;



public class Tester {

	public static void main(String[] args) {
		Person p=null;
	chckedPerson(p);
	System.out.println(p);
	p=new Person ("mary");
	chckedPerson(p);
	System.out.println(p);
     
	}
	
	public static Person chckedPerson(Person p) {
		if(p==null) {
			p=new Person("joe");
		}else {
			p=null;
		}
		return p;
	}

}
