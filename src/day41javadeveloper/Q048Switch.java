package day41javadeveloper;

class Tester08 {
    public static void main(String[] args) {
        char letter= 'b';
        int i= 0;
        switch (letter){
            case 'a':
                i++;
                break;
            case 'b':
                i++;
            case 'c' | 'd'://line 1
                i++;
            case 'e':
                i++;
                break;
            case 'f':
                i++;
                break;
            default:
                System.out.println(letter);

        }
        System.out.println(i);
    }
}

/*
What is the result?
A. b1
B. 2
C. b2
D. 1
E. b3
F. 3
G. The compilation fails due to an error in line 1.


Answer: F

 */
