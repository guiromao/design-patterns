package co.gromao.designpatterns.core.adapter;

public class PaymentAdapter {

    public void pay(String currency, double amount) {
        double rate = findDollarRateOf(currency);
        PaymentProcessor paymentProcessor = new PaymentProcessorImpl();

        paymentProcessor.pay(amount * rate);
    }

    private double findDollarRateOf(String currency) {
        return switch(currency) {
            case "euro" -> 1.25;
            case "yen" -> 0.3;
            case "rupee" -> 0.015;
            default -> 1;
        };
    }
}
