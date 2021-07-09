package A01codingbat;

public class warmup01 {
    public static void main(String[] args) {


        System.out.println(ex("re", "eesdf"));

    }

    public static String ex(String a, String b) {
        String res="";
        if(a.length()==b.length()){
            res= a+b;
        }else if(a.length()>b.length()){
            res= a.substring(a.length()-b.length())+b;
        }else if(a.length()<b.length()){
            res= a+b.substring(b.length()-a.length()) ;
        }
        return res;
    }

}

