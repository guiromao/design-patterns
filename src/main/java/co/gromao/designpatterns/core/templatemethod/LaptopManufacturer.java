package co.gromao.designpatterns.core.templatemethod;

public class LaptopManufacturer extends ComputerManufacturer {

    @Override
    protected void addHardDisk() {
        System.out.println("Adding Hard disk on Laptop computer...");
    }

    @Override
    protected void addRam() {
        System.out.println("Adding RAM on Laptop computer...");
    }

    @Override
    protected void addKeyboard() {
        System.out.println("Adding keyboard on Laptop computer...");
    }

}
