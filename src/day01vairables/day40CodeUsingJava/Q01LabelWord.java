package day01vairables.day40CodeUsingJava;

//https://www.codeusingjava.com/javacert/1z0819/quiz1

class Q01 {
}

class Q13 {
    public static void main(String[] args) {
        int count = 0;
        if1:
        for (int i = 2; i <= 100; i = i + 2) {
            count++;
            System.out.println("Hello");
            if (i == 20) {

                break if1; // 'if' is a key word, can not be used for label name
            }
        }
        System.out.println(count);
    }
}