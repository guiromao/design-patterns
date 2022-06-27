package co.gromao.designpatterns.core.templatemethod;

public abstract class ComputerManufacturer {

    public void buildComputer() {
        addHardDisk();
        addRam();
        addKeyboard();

        System.out.println("Computer assembled!");
    }

    protected abstract void addHardDisk();

    protected abstract void addRam();

    protected abstract void addKeyboard();

}
