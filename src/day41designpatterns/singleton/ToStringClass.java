package day41designpatterns.singleton;

public class ToStringClass {

    String name;
    String lname;

    ToStringClass(String name, String lname){
        this.lname=lname;
        this.name=name;
    }

    public String toString(){
        return name + " " +lname;
    }
}

class ToSTringTest{
    public static void main(String[] args) {
        ToStringClass obj = new ToStringClass("hi","by");
        System.out.println(obj.lname);
        System.out.println(obj.name);
        System.out.println(obj);
    }
}
