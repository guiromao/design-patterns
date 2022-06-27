package co.gromao.designpatterns.core.factory;

public class PersonFactory {

    public static Person createPerson(String type) {
        Person person = null;

        if ("male".equalsIgnoreCase(type)) {
            person = new Male();
        } else if ("female".equalsIgnoreCase(type)) {
            person = new Female();
        }

        return person;
    }

}
