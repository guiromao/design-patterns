package co.gromao.designpatterns.core.adapter;

public class PaymentApp {

    public void pay(String currency, double amount) {
        PaymentAdapter paymentAdapter = new PaymentAdapter();

        paymentAdapter.pay(currency, amount);
    }

    public static void main(String[] args) {
        PaymentApp app = new PaymentApp();

        app.pay("euro", 1000);
        app.pay("yen", 500);
        app.pay("rupee", 20000);
    }

}
