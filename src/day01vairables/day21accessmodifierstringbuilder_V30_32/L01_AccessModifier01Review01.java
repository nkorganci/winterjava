package day01vairables.day21accessmodifierstringbuilder_V30_32;

public class L01_AccessModifier01Review01 {
    /*
     * 1-These are instance variables and methods, in order to reach them we need to create object of class
     * 2-Same Package: public, default, protected can be called, only private can not be calley in another class.
     * 3-Different Package: Public, protected accessible, but default and private are not.
     * 4-
     */

    private String privateString = "Private String";
    static protected String protectedString = "Protected String";
    String defaultString = "Default String";
    public String publicString = "public String";

    public void publicMethod() {
	System.out.println("This is a public method");
    }

    protected void protectedMethod() {
	System.out.println("This is a protected method");
    }

    void defaultMethod() {
	System.out.println("This is a default method");
    }

    private void privateMethod() {
	System.out.println("This is a public method");
    }

}
