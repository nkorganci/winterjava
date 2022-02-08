package day22stringbuilderencapsulation_31;

public class P1_EncapsulationA {
    private String name;
    private int age;
    //Constructor
    public P1_EncapsulationA(String name,int age){
        this.name=name;
        if(age<0){
            age=0;
            System.out.println("Age can not be less than 0");
        }
        this.age=age;
    }
    //Getter methods
    public String getName(){
        return this.name;
    }
    public int getAge(){return this.age;
    }
    //Setter methods
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age<0){
            age=0;
        }
        this.age=age;
    }

    public static void main(String[] args) {

    }
}
