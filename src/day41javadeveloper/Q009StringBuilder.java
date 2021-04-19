package day41javadeveloper;

class Q003StringBuilder {
}

class Tester {//Answer: D
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        sb.append("HOWDY");
        System.out.println(sb.length());
        sb.insert(0,' ');
        System.out.println(sb.length());
        sb.replace(3,5,"LL");
        System.out.println(sb.length());
        sb.insert(6, "COW");
        System.out.println(sb.length());
        sb.delete(2,7);
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
/*
What is the result?
A. 4
B. 3
C. An exception is thrown at runtime.
 D. 5
Answer: D
 */