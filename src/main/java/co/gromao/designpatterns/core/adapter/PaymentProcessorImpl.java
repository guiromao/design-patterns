package co.gromao.designpatterns.core.adapter;

public class PaymentProcessorImpl implements PaymentProcessor {

    @Override
    public void pay(double dollars) {
        System.out.println("Processed payment of: $" + dollars);
    }

}
