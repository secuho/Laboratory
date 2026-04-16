package inheritancestudy;

public class Wizard extends Character{

    public Wizard(String name) {
        super(name);
        this.hp = 80;
    }

    public void castSpell() {
        System.out.println(name + "가 마법을 사용합니다!");
    }
}
