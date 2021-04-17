package day00notes;

public class L01_Label {

    public static void main(String[] args) {
        if1:
        for (int i = 2; i <= 8; i = i + 2) {
            System.out.println("Hello");
            if (i == 4) {
                break if1;
            }
        }
    }
}
