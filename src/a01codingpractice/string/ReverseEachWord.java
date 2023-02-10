package a01codingpractice.string;

public class ReverseEachWord {
    public static void main(String[] args) {

        reverseWord("Hello World");
    }

    public static void reverseWord(String str) {

        String[] arr = str.split(" ");

        String result = "";
        for (String str1 : arr) {
            String w = "";
            for (int i = str1.length() - 1; i >= 0; i--) {
                w += str1.charAt(i);
            }
            result += w + " ";

        }
        System.out.println(result);

    }
}
