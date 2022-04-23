package bosssingleton.java;

public class FinalBoss {

    static int HP;
    static int damage;
    private static FinalBoss instance = new FinalBoss(HP, damage);

    private FinalBoss(int HP, int damage) {

        FinalBoss.HP = 250;
        FinalBoss.damage = 60;
    }

    public static FinalBoss getInstance() {

        return instance;
    }

    public void sayIntroPhrase() {

        System.out.println("If you will not turn... you will die!");

    }

    public static int getHP() {
        return HP;
    }

    public static int getDamage() {
        return damage;
    }

}
