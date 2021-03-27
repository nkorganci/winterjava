package day30interfaces_43;

/*
1- No need to write "public" and "abstract" it is default in abstact methods.
 */
public interface Sound {

    //Methods are public and abstract in an interface
    void sound();
   void increaseVolume();
    void decreaseVolume();

    //Variables in interfaces are "static" and "final", no need to write them.
     public static int LEVEL = 12;
            static int LEVEL1 = 12;
                    int LEVEL2 = 12;

}
