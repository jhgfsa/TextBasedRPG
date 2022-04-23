package enemyfactory.java;

public class SmallEnemy extends Enemy {

    String name;
    String[] drops;
    int physicalDmg;
    int specialDmg;
    int HP;
    int force;
    int speed;
    int exp;
    int credits;

    public SmallEnemy(String name, String[] drops, int physicalDmg, int specialDmg, int HP, int force, int speed,
            int exp, int credits) {

        this.name = name;
        this.drops = drops;
        this.physicalDmg = physicalDmg;
        this.specialDmg = specialDmg;
        this.HP = HP;
        this.force = force;
        this.speed = speed;
        this.exp = exp;
        this.credits = credits;
    }

    public int attack() {

        return physicalDmg;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDrops() {
        return drops;
    }

    public void setDrops(String[] drops) {
        this.drops = drops;
    }

    public int getPhysicalDmg() {
        return physicalDmg;
    }

    public void setPhysicalDmg(int physicalDmg) {
        this.physicalDmg = physicalDmg;
    }

    public int getSpecialDmg() {
        return specialDmg;
    }

    public void setSpecialDmg(int specialDmg) {
        this.specialDmg = specialDmg;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int hP) {
        HP = hP;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

}
