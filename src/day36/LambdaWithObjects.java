package day36;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaWithObjects {
    public static void main(String[] args) {

//Create 4 objects by using Course class
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        //Add them into a list
        List<Course> list = new ArrayList<>();
        list.add(courseTurkishDay);
        list.add(courseTurkishNight);
        list.add(courseEnglishDay);
        list.add(courseEnglishNight);

        System.out.println(list);

        System.out.println(checkAvg(list));
        System.out.println(checkNumberOfStudents(list));
    }

    //Check if all average scores are less than 98
    public static boolean checkAvg(List<Course> list) {

        return list.stream().allMatch(t -> t.getAverageScore() < 98);
    }

    //Check if all course names contain "Day" word
    public static boolean checkDay(List<Course> list) {
        return list.stream().allMatch(t -> t.getCourseName().contains("Day"));
    }

    //check if any number of students is 154
    public static boolean checkNumOfStd(List<Course> list) {
        return list.stream().anyMatch(t -> t.getNumberOfStudents() == 154);
    }

    //Check if no number of students is 100
    public static boolean checkNumberOfStudents(List<Course> list) {
        return list.stream().noneMatch(t -> t.getNumberOfStudents() == 100);
    }

    //Sort the elements in natural order according to the average score
    public static void sorAverageScores(List<Course> list) {

        list.stream().sorted(Comparator.comparing(Course::getAverageScore)).forEach(t -> System.out.println(t + "//"));
    }
    //Sort thelements in reveerse order according to the course name.
    public static void sortEveryScoreSt(List<Course> list) {
        list.stream().sorted(Comparator.comparing(Course::getNumberOfStudents)).forEach(System.out::println);

    }
}
