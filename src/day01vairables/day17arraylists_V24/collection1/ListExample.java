package day01vairables.day17arraylists_V24.collection1;

import java.util.Iterator;
import java.util.List;

public class ListExample {

}

class Shipment implements Iterable<Product> {
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;

    public void add(Product product) {

    }

    public boolean replace(Product oldProduct, Product newProduct) {
        return true;
    }

    public void prepare() {

    }

    public List<Product> getHeavyVanProducts() {
        return null;
    }

    public List<Product> getLightVanProducts() {
        return null;
    }

    public Iterator<Product> iterator() {
        return null;
    }
}

class ShipmentTest {

}
