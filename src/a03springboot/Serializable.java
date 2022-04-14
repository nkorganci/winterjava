package a03springboot;

public class Serializable {
}

// Employee clas
class Employee implements java.io.Serializable{
    private int id;
    private String name;
    public Employee(){

    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

//Testing Bean

class Test{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(4);
        System.out.println(e.getId());

    }
}