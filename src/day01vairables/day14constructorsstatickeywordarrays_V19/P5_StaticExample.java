package day01vairables.day14constructorsstatickeywordarrays_V19;

public class P5_StaticExample {
    private String name;
    private String lname;

    //Setter and Getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public static void main(String[] args) {

    }
}

class Writers{
    private static P5_StaticExample[] writers;
    static {
        writers= new P5_StaticExample[5];
        writers[0]= new P5_StaticExample();
    }
//    public static P5_StaticExample[] getWriters(){
//
//    }
}
