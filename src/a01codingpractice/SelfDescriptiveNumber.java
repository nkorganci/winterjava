package a01codingpractice;

public class SelfDescriptiveNumber {
    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            if (isSelfDescriptiveNumber(i)) {
                System.out.println(i + "   ");
            }
        }

    }

    public static boolean isSelfDescriptiveNumber(int num) {
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {
            String temp_char = s.charAt(i) + "";
            int b = Integer.parseInt((temp_char));// will give index number
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                int temp = Integer.parseInt(s.charAt(j) + "");
                if (temp == i) {
                    count++;// will give number of repeated times
                }
            }
            if (count != b) {
                return false;
            }
        }
        return true;
    }
}


