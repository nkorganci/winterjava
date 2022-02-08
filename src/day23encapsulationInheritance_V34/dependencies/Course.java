package day23encapsulationInheritance_V34.dependencies;

public class Course {
    private String course;
    private int code;

    public Course(String course, int code) {
        this.course = course;
        this.code = code;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static void main(String[] args) {

    }
    // Course USES a Student class (course depends on student class)
    public double average(Student[] students){
        double sum = 0;
        for (int i = 0; i <students.length; i++) {
                sum+=students[i].getAge();
        }
        return sum/students.length;
    }
}
