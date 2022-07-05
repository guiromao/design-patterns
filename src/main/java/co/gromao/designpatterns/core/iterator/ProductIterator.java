package co.gromao.designpatterns.core.iterator;

import java.util.Objects;

public class ProductIterator implements Iterator {

    private Product[] products;
    private int pos;

    public ProductIterator(Product[] products) {
        this.products = products;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos >= 0 && pos < products.length && Objects.nonNull(products[pos]);
    }

    @Override
    public Product next() {
        return products[pos++];
    }

}
