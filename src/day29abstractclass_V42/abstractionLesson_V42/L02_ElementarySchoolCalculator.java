package day29abstractclass_V42.abstractionLesson_V42;

public class L02_ElementarySchoolCalculator extends L05_BlindCalculator {


    @Override
    int add(int... a) {

        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }

        return sum;
    }

    @Override
    int subtraction(int... a) {
        int diff = 0;
        for (int w : a) {
            diff = diff - w;
        }
        return diff;
    }

    @Override
    int division(int a, int b) {
        int div = 1;

        div = a / b;

        return div;
    }

    @Override
    int multiplication(int... a) {

        int prod = 1;
        for (int w : a) {
            prod = prod * w;
        }
        return prod;
    }

    @Override
    public void read() {
        System.out.println("I am reading");
    }
}
