package co.gromao.designpatterns.core.factory;

public class Male implements Person {

    @Override
    public void wish(String message) {
        System.out.println("As a Male, I wish for: " + message);
    }

}
