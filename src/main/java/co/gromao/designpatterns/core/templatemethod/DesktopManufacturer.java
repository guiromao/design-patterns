package co.gromao.designpatterns.core.templatemethod;

public class DesktopManufacturer extends ComputerManufacturer {

    @Override
    protected void addHardDisk() {
        System.out.println("Adding Hard Disk on Desktop computer...");
    }

    @Override
    protected void addRam() {
        System.out.println("Adding RAM on Desktop computer...");
    }

    @Override
    protected void addKeyboard() {
        System.out.println("Adding keyboard on Desktop computer...");
    }

}
