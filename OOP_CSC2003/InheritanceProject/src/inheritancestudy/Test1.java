package inheritancestudy;

public class Test1 {
    public static void main(String[] args) {

        Warrior w = new Warrior("James");
        w.swordAttack();
        System.out.println(w.showStatus());

        System.out.println();

        Wizard m = new Wizard("Steve");
        m.castSpell();
        System.out.println(m.showStatus());

    }
}
