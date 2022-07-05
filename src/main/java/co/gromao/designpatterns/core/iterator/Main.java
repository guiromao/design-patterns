package co.gromao.designpatterns.core.iterator;

public class Main {

    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();
        products.add(new Product("Computer"));
        products.add(new Product("Phone"));
        products.add(new Product("Table"));
        products.add(new Product("Airplane"));

        ProductIterator iterator = products.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
