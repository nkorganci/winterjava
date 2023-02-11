package day41designpatterns.datastructure;

import java.lang.reflect.Field;

public class Reflection {
    //1 Private fields methods can be got by Reflection class
    //2 Spring boot framework uses reflection often
    //3 Reflection can easily break or access private codes
    //4 If you change it , difficult to maintain code.
    //5 Reflection work at runtime so not good at optimization and speed

    private String name;
    private String lname;
    private int num;
    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public int getNum() {
        return num;
    }

    private void privateMethod(){
        System.out.println("This is a private method");
    }
}

class ReflectionTest{

    public static void main(String[] args) throws Exception {

        Reflection obj = new Reflection();
       Field[] fields= obj.getClass().getDeclaredFields();

       // Get private Fields
        for(Field field: fields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(obj,"hello");
            }
            System.out.println(obj.getName());
        }
    }
}


