package day01vairables.day14constructorsstatickeywordarrays_V19;

public class P3_ExampleCalAvr {
    public String name;
    public int grade;
    public P3_ExampleCalAvr(String name,int grade){
        this.grade=grade;
        this.name=name;
    }
    public void average(int[] grades){
        double sum =0;
        for(int i: grades){
            sum+=i;
        }
        double av = sum/grades.length;
        System.out.println("Your average: " + av);
    }
    public static void main(String[] args) {

    }
}
