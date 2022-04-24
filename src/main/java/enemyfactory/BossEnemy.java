package main.java.enemyfactory;

// TODO: Auto-generated Javadoc
/**
 * The Class BossEnemy is a extension of enemy which is the factory design
 * pattern.
 */
public class BossEnemy extends Enemy {

    /** The name. */
    String name;

    /** The physical dmg. */
    int physicalDmg;

    /** The special dmg. */
    int specialDmg;

    /** The hp. */
    int HP;

    /** The force. */
    int force;

    /** The speed. */
    int speed;

    /** The exp. */
    int exp;

    /** The credits. */
    int credits;

    /**
     * Instantiates a new boss enemy.
     *
     * @param name        the name
     * @param physicalDmg the physical dmg
     * @param specialDmg  the special dmg
     * @param HP          the hp
     * @param force       the force
     * @param speed       the speed
     * @param exp         the exp
     * @param credits     the credits
     */
    public BossEnemy(String name, int physicalDmg, int specialDmg, int HP, int force, int speed, int exp, int credits) {

        this.name = name;
        this.physicalDmg = physicalDmg;
        this.specialDmg = specialDmg;
        this.HP = HP;
        this.force = force;
        this.speed = speed;
        this.exp = exp;
        this.credits = credits;
    }

    /**
     * Attack.
     *
     * @return the int
     */
    public int attack() {

        return physicalDmg;

    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the physical dmg.
     *
     * @return the physical dmg
     */
    public int getPhysicalDmg() {
        return physicalDmg;
    }

    /**
     * Sets the physical dmg.
     *
     * @param physicalDmg the new physical dmg
     */
    public void setPhysicalDmg(int physicalDmg) {
        this.physicalDmg = physicalDmg;
    }

    /**
     * Gets the special dmg.
     *
     * @return the special dmg
     */
    public int getSpecialDmg() {
        return specialDmg;
    }

    /**
     * Sets the special dmg.
     *
     * @param specialDmg the new special dmg
     */
    public void setSpecialDmg(int specialDmg) {
        this.specialDmg = specialDmg;
    }

    /**
     * Gets the hp.
     *
     * @return the hp
     */
    public int getHP() {
        return HP;
    }

    /**
     * Sets the hp.
     *
     * @param hP the new hp
     */
    public void setHP(int hP) {
        HP = hP;
    }

    /**
     * Gets the force.
     *
     * @return the force
     */
    public int getForce() {
        return force;
    }

    /**
     * Sets the force.
     *
     * @param force the new force
     */
    public void setForce(int force) {
        this.force = force;
    }

    /**
     * Gets the speed.
     *
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed.
     *
     * @param speed the new speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Gets the exp.
     *
     * @return the exp
     */
    public int getExp() {
        return exp;
    }

    /**
     * Sets the exp.
     *
     * @param exp the new exp
     */
    public void setExp(int exp) {
        this.exp = exp;
    }

    /**
     * Gets the credits.
     *
     * @return the credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets the credits.
     *
     * @param credits the new credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

}
