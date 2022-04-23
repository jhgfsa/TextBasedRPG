package enemyfactory.java;

public abstract class Enemy {

    public abstract int attack();

    public abstract String getName();

    public abstract String[] getDrops();

    public abstract int getPhysicalDmg();

    public abstract int getSpecialDmg();

    public abstract int getHP();

    public abstract int getForce();

    public abstract int getExp();

    public abstract int getCredits();

}