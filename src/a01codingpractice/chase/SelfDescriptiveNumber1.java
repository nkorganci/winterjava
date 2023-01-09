package a01codingpractice.chase;

public class SelfDescriptiveNumber1 {

    public static void main(String[] args) {

        System.out.println(isSelfDescriptiveNumber(2020));
    }

    public static boolean isSelfDescriptiveNumber(int num) {

        // converting the integer num to string
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {

            // Extracting each digit one by one from the string
            String temp_char = s.charAt(i) + "";

            // converting the string (digit) into integer
            // b variable stores the digit present at index 'i'
            int b = Integer.parseInt(temp_char);

            // counting how many times the particular digit
            // occur in the whole number "num"
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                // converting string char to integer
                int temp = Integer.parseInt(s.charAt(j) + "");

                // checking whether it is equal to the index 'i'
                // if it is then increment the count .
                if (temp == i) {
                    count++;
                }
            }

            // If it is not equal
            // it return false .
            if (count != b)
                return false;
        }
        return true;
    }
}
