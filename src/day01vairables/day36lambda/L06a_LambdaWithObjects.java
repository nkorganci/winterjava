package day01vairables.day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L06a_LambdaWithObjects {
    public static void main(String[] args) {

//Create 4 objects by using L06_Course class
        L06_Course courseTurkishDay = new L06_Course("Summer", "Turkish Day", 97, 128);
        L06_Course courseTurkishNight = new L06_Course("Winter", "Turkish Night", 98, 154);
        L06_Course courseEnglishDay = new L06_Course("Spring", "English Day", 95, 132);
        L06_Course courseEnglishNight = new L06_Course("Winter", "English Night", 93, 144);

        //Add them into a list
        List<L06_Course> list = new ArrayList<>();
        list.add(courseTurkishDay);
        list.add(courseTurkishNight);
        list.add(courseEnglishDay);
        list.add(courseEnglishNight);

        System.out.println(list);

        System.out.println(checkAvg(list));

    }

    //Check if all average scores are less than 98
    public static boolean checkAvg(List<L06_Course> list) {

        return list.stream().allMatch(t->t.getNumberOfStudents()<156);

       //return list.stream().allMatch(t -> t.getAverageScore() < 98);

    }//boolean allMatch(Predicate<? super T> predicate);

    //Check if all course names contain "Day" word
    public static boolean checkDay(List<L06_Course> list) {
        return list.stream().allMatch(t->t.getCourseName().contains("word"));
    }

    //check if any number of students is 154
    public static boolean checkNumOfStd(List<L06_Course> list) {
        return list.stream().anyMatch(t -> t.getNumberOfStudents() == 154);
    }

    //Check if no number of students is 100
    public static boolean checkNumberOfStudents(List<L06_Course> list) {
        return list.stream().noneMatch(t -> t.getNumberOfStudents() == 100);
    }

    //Sort the elements in natural order according to the average score
    public static void sorAverageScores(List<L06_Course> list) {

        list.stream().sorted(Comparator.comparing(L06_Course::getAverageScore)).forEach(t -> System.out.println(t + "//"));
    }

    //Sort thelements in reverse order according to the course name.
    public static void sortEveryScoreSt(List<L06_Course> list) {
        list.stream().sorted(Comparator.comparing(L06_Course::getNumberOfStudents).reversed()).forEach(System.out::println);

    }


}
