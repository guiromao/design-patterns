package co.gromao.designpatterns.core.factory;

public class Female implements Person {

    @Override
    public void wish(String message) {
        System.out.println("As a Female, I wish for: " + message);
    }

}
