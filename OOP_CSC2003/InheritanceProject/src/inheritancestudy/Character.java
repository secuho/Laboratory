package inheritancestudy;

public class Character {
    protected String name;
    protected int level;
    protected int hp;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 100;
    }

    public String showStatus() {
        return "Name: " + name + ", Level: " + level + ", HP: " + hp;
    }
}
