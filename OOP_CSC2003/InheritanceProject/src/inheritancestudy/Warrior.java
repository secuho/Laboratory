package inheritancestudy;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        this.hp = 150;
    }

    public void swordAttack() {
        System.out.println(name + "가 검으로 공격합니다!");
    }

}
