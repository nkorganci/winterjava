package day01vairables.day14constructorsstatickeywordarrays_V19;

public class P4_StaticCodeBlock {

    // Class variables
    public String name;
    public static int counter;

    // Constructor
    public P4_StaticCodeBlock(String name){
        this.name=name;
        System.out.println("6 Counter"+counter);
        counter++;
    }
    //NonStatic Code block
    {
        System.out.println("3 I am a code block, nonstatic");// works for each object creation
    }
    //Static code block
    static {
        System.out.println("4 I am a static code block");//works just once
        counter=3;
    }
    public static void main(String[] args) {

    }
}
