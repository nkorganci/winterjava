package A01codingbat;

public interface  Interf  {
    public static void main(String[] args) {


    }

}

interface One {
    default void method() {
        System.out.println("One");
    }
}

interface Two {
    default void method () {
        System.out.println("One");
    }
}

class  Three implements One,Two{

    @Override
    public void method() {
        One.super.method();
    }
}

