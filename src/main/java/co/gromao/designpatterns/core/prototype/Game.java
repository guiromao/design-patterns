package co.gromao.designpatterns.core.prototype;

public class Game implements Cloneable {

    private Integer id;
    private String name;
    private Membership membership;

    public Game(Integer id, String name, Membership membership) {
        this.id = id;
        this.name = name;
        this.membership = membership;
    }

    public Game(Game game) {
        this.id = game.id;
        this.name = game.name;
        this.membership = new Membership();
    }

    @Override
    protected Game clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        game.setMembership(new Membership());

        return game;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", membership=" + membership +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

}
