package util;

import model.entities.Product;

import java.util.function.Consumer;

public class UpdatePrice implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
