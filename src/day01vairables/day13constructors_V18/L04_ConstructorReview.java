package day01vairables.day13constructors_V18;

public class L04_ConstructorReview {
    int id;
    String b;

    L04_ConstructorReview() {
        System.out.println("hi");
    }

    L04_ConstructorReview(int a, String b) {
        this.id = a;
        this.b = b;

    }

    public static void main(String[] args) {
        L04_ConstructorReview obj = new L04_ConstructorReview();
        obj.display();

        L04_ConstructorReview obj1 = new L04_ConstructorReview(2, "ss");
        obj1.display();

    }

    void display() {
        System.out.println(id + " " + b);
    }

}
