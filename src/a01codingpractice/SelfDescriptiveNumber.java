package a01codingpractice;

public class SelfDescriptiveNumber {
    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            if(isSelfDescriptiveNumber(i)){
                System.out.println(i+"   ");
            }
        }


    }
    public static boolean isSelfDescriptiveNumber(int num) {
        //Converting the integer num to string
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {
            //Extracting each digit one by one from the string
            String temp_char = s.charAt(i) + "";
            System.out.print(temp_char);

            //Converting the string(digit) into integer
            //b variable stores the digit present at index 'i'
            int b = Integer.parseInt((temp_char));

            //Counting how many times the particular digit
            //Occur in the whole number "num
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                //Converting string char to Integer
                int temp = Integer.parseInt(s.charAt(j) + "");
                //Checking whether it is equal to the index 'i'
                //If it is then increment the count
                if (temp == i) {
                    count++;
                }
            }
            if (count != b) {
                return false;
            }

        }
            return true;

    }
}

