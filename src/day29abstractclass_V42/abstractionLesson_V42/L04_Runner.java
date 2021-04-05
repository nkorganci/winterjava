package day29abstractclass_V42.abstractionLesson_V42;

public class L04_Runner {
    public static void main(String[] args) {

        L02_ElementarySchoolCalculator elCalculator = new L02_ElementarySchoolCalculator();

        System.out.println(elCalculator.add(2,3,4));
        System.out.println(elCalculator.subtraction(2,4,5));
        System.out.println(elCalculator.division(9,3));

        L03_HighSchoolCalculator hsCalculator = new L03_HighSchoolCalculator();
        System.out.println(hsCalculator.add(21,3,6));
        System.out.println(hsCalculator.sqrt(-4));

    }
}
