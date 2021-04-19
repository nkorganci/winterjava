package day41javadeveloper.Q061;

public class Main {
    public static void main(String[] args) {
        for ( int i =0; i<args.length; i++){
            System.out.println(i+ "). " + args[i]);
            switch (args[i]){
                case "one":
                    continue;
                case "two":
                    i--;
                    continue;
                default:
                    break;
            }
        }
    }
}


/*
executed with this command:
java Main one two three
What is the result?
A. 0). one
B. 0). one1). two2). three
C. The compilation fails.
D. It creates an infinite loop printing:0). one1). two1). two...
E. A java.lang.NullPointerException is thrown.
Answer: D
 */
