package main.java.enemyfactory;

// TODO: Auto-generated Javadoc
/**
 * The Class Enemy is an abstract class used in the enemy factory design
 * pattern.
 */
public abstract class Enemy {

    /**
     * Attack.
     *
     * @return the int
     */
    public abstract int attack();

    /**
     * Gets the name.
     *
     * @return the name
     */
    public abstract String getName();

    /**
     * Gets the physical dmg.
     *
     * @return the physical dmg
     */
    public abstract int getPhysicalDmg();

    /**
     * Gets the special dmg.
     *
     * @return the special dmg
     */
    public abstract int getSpecialDmg();

    /**
     * Gets the hp.
     *
     * @return the hp
     */
    public abstract int getHP();

    /**
     * Gets the force.
     *
     * @return the force
     */
    public abstract int getForce();

    /**
     * Gets the speed.
     *
     * @return the speed
     */
    public abstract int getSpeed();

    /**
     * Gets the exp.
     *
     * @return the exp
     */
    public abstract int getExp();

    /**
     * Gets the credits.
     *
     * @return the credits
     */
    public abstract int getCredits();

}
