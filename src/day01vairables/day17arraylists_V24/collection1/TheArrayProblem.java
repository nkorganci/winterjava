package day01vairables.day17arraylists_V24.collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class TheArrayProblem {

    public static void main(String[] args) {
        Product a = new Product("a",1);
        Product b = new Product("a1",11);
        Product c = new Product("a2",12);

        Product[] products = {a,b,c};
//        System.out.println(products);// We can not print easily
//        System.out.println(Arrays.toString(products));

        Collection<Product> products1 = new ArrayList<>();
        products1.add(a);
        products1.add(a);
        products1.add(a);

        Iterator<Product> iterator = products1.iterator();

        while (iterator.hasNext()){

            iterator.next();
            System.out.println(products1);

        }

    }
}
