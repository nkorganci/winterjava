package a02Review.string;

public class ToString {
    int num;
    String name;

    ToString(int num,String name){
        this.name=name;
        this.num=num;
    }

    public String toString(){
        return name+ " "+ num;
    }

    public static void main(String[] args) {
        ToString obj1 = new ToString(1,"Hi");
        ToString obj2 = new ToString(2,"bye");
        System.out.println(obj1);//compiler writes here s1.toString()
        System.out.println(obj2);

        // All values can be coverted to string
        Integer  a = 2;
        System.out.println(a.toString(a));
    }
}

class ToString1 {
    String n = "hello";
    Integer i = 22;

    ToString1(String n, Integer i){
        this.i=i;
        this.n=n;
    }

    @Override
    public String toString() {
        return "ToString1{" +
                "n='" + n + '\'' +
                ", i=" + i +
                '}';
    }

    public static void main(String[] args) {
        ToString1 obj = new ToString1("sdf",33);
        System.out.println(obj);
        System.out.println(obj.toString());// calling the class version of string

        System.out.println(Integer.toString(12));// Calling orignal string
    }
}

class Test {

    public static void main(String args[]) {
        Integer x = 5;

        System.out.println(x.toString());
        System.out.println(Integer.toString(12));
    }
}
