package day41designpatterns.datastructure;

public class PojoClass {
    private String text;
    private int number;

    public String toString(){
        return text + " " + number;
    }
}

class SpringBeanVsJavaBean{
    public static void main(String[] args) {
        PojoClass pojo = new PojoClass();
        System.out.println(pojo);
    }
}
