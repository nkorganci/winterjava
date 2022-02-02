package day14constructorsstatickeywordarrays_V19;

public class P3_ExampleMainClass {
    public static void main(String[] args) {

        P3_ExampleCalAvr obj1 = new P3_ExampleCalAvr("Physics",22);
        P3_ExampleCalAvr obj2 = new P3_ExampleCalAvr("Math",44);

        P3_ExampleCalAvr[] lessons = new P3_ExampleCalAvr[10];// I can create variable from class/constructor
        P3_ExampleCalAvr[] lessons1 = {obj1,obj2};
        int[] grades = {70,20,100};//Manual
        int[] grades1= {obj1.grade,obj2.grade};
            obj1.average(grades1);

    }
}
