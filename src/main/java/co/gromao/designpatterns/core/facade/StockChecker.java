package co.gromao.designpatterns.core.facade;

public class StockChecker {

    public boolean checkStock(String productId) {
        if ("Laptop".equals(productId)) {
            System.out.println("Checking stock for " + productId + "... It exists!");
            return true;
        } else {
            System.out.println("Product with ID " + productId + " doesn't exist in stock.");
            return false;
        }
    }

}
