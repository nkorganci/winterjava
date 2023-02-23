package day43kodluyoruzcamp;

public class MainProduct {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setAge(1);
        product1.setName("a");

        Product product2 = new Product();
        product2.setAge(2);
        product2.setName("b");

        Product[] products = {product1, product2};
        System.out.println("<lu>");

        for (Product p : products) {
            System.out.println("<li>" + p.getAge() + "</li>");
        }
        System.out.println("</lu>");


    }
}

class Product {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
