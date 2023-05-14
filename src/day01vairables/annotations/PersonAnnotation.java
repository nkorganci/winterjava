package day01vairables.annotations;

public class PersonAnnotation implements Comparable<PersonAnnotation> {
    private String name;
    private int age;

    public PersonAnnotation(String name,int age){
        this.name= name;
        this.age=age;
    }

    public int compareTo(PersonAnnotation p){
        int compare = name.compareTo(p.name);
        return compare !=0 ? compare : p.age - age;
    }

//    @Override
//    public String toStrong(){
//        return name;

}
