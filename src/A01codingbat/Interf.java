package A01codingbat;

public interface Interf {
    public static void main(String[] args) {

        Interface1.print();
        Interface2.print();
    }

}

interface Interface1 {
    void print();
}

interface Interface2 {
    Interface1.print();
}
