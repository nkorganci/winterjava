package day01vairables.day30interfaces_43.interfacelesson_V43;

public interface L02_Sound {
    // Methods
    //All of them are same, no need to write public, abstract, they are default.
    void sound();
    abstract void sound1();
    public abstract void sound2();

    //All Variables in an interface are public, static and final as default.

    int LEVEL = 12;
   final int LEVEL1 = 12;
   static final int LEVEL2 = 12;
    public static final int LEVEL3 = 12;

}
