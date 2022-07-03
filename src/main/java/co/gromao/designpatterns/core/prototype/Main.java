package co.gromao.designpatterns.core.prototype;

public class Main {

    public static void main(String[] args) {
        try {
            Game game1 = new Game(1, "GTA V", new Membership());
            Game game2 = game1.clone();
            Game game3 = new Game(game1);

            System.out.println(game1);
            System.out.println(game2);
            System.out.println(game3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
