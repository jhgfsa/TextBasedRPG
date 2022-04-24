package main.java.bosssingleton;

// TODO: Auto-generated Javadoc
/**
 * The Class FinalBos is a singleton design pattern to create just one final
 * boss object
 */
public class FinalBoss {

    /** The hp. */
    static int HP;

    /** The damage. */
    static int damage;

    /** The instance. */
    private static FinalBoss instance = new FinalBoss(HP, damage);

    /**
     * Instantiates a new final boss.
     *
     * @param HP     the hp
     * @param damage the damage
     */
    private FinalBoss(int HP, int damage) {

        FinalBoss.HP = 250;
        FinalBoss.damage = 60;
    }

    /**
     * Gets the single instance of FinalBoss.
     *
     * @return single instance of FinalBoss
     */
    public static FinalBoss getInstance() {

        return instance;
    }

    /**
     * Say intro phrase.
     */
    public void sayIntroPhrase() {

        System.out.println("If you will not turn... you will die!");

    }

    /**
     * Gets the hp.
     *
     * @return the hp
     */
    public static int getHP() {
        return HP;
    }

    /**
     * Gets the damage.
     *
     * @return the damage
     */
    public static int getDamage() {
        return damage;
    }

}
