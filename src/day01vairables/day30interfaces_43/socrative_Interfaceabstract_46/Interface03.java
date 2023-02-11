package day01vairables.day30interfaces_43.socrative_Interfaceabstract_46;

public interface Interface03 {

    int v1 = 2000;
    String str1 = "Honda";
}

interface Interface04 {

    int v1 = 3000;
    String str2 = "Audi";
}

class C01 implements Interface03, Interface04 {

    public static void main(String[] args) {
        System.out.println(Interface03.str1);
        System.out.println(Interface04.str2);
        System.out.println(Interface04.v1);
        System.out.println(str2);
        // System.out.println(v1); //Reference to 'v1' is ambiguous, both 'Interface03.v1' and 'Interface04.v1' match
    }

}

