package co.gromao.designpatterns.core.iterator;

public class ProductCollection implements Collection {

    private Product[] products;
    private int numberOfProducts;

    public ProductCollection() {
        this.products = new Product[10];
        this.numberOfProducts = 0;
    }

    public void add(Product product) {
        products[numberOfProducts] = product;
        numberOfProducts++;
    }

    @Override
    public ProductIterator createIterator() {
        return new ProductIterator(products);
    }

}
