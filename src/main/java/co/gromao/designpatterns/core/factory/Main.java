package co.gromao.designpatterns.core.factory;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Person person = PersonFactory.createPerson("female");

        if (Objects.nonNull(person)) {
            person.wish("Good stuff");
        }
    }

}
