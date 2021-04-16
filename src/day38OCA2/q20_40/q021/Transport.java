package day38OCA2.q20_40.q021;

class Vehicle {
	Vehicle(){
		System.out.println("Vehicle");
	}
}

class Bus extends Vehicle{
	Bus(){
		System.out.println("Bus");
	}
}

public class Transport {
	public static void main(String[] args) {
		Vehicle v = new Bus(); // If Vehicle--> Bus,  will not change the result
	}
}
//What is the result?
//A.	Vehicle 
//		Bus
//B.	Bus
//		Vehicle
//C.	Bus
//D.	The program doesn’t print anything
