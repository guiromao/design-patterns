package co.gromao.designpatterns.core.templatemethod;

public class Main {

    public static void main(String[] args) {
        ComputerManufacturer manufacturer = new LaptopManufacturer();

        manufacturer.buildComputer();
    }

}
