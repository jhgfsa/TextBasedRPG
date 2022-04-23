package characterbuilder.java;

public class Character {

    private String role;
    private String species;
    private String weapon;
    private String helmet;
    private String armor;
    private String pants;
    private String boots;
    private int HP;
    private int force;
    private int physicalDmg;
    private int specialDmg;
    private int speed;
    private int exp;
    private int level;
    private int credits;
    private String status;

    public Character(CharacterBuilder builder) {
        this.role = builder.role;
        this.species = builder.species;
        this.weapon = builder.weapon;
        this.helmet = builder.helmet;
        this.armor = builder.armor;
        this.pants = builder.pants;
        this.boots = builder.boots;
        this.HP = builder.HP;
        this.force = builder.force;
        this.physicalDmg = builder.physicalDmg;
        this.specialDmg = builder.specialDmg;
        this.speed = builder.speed;
        this.exp = builder.exp;
        this.level = builder.level;
        this.credits = builder.credits;
        this.status = builder.status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getHelmet() {
        return helmet;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public String getBoots() {
        return boots;
    }

    public void setBoots(String boots) {
        this.boots = boots;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getMoney() {
        return credits;
    }

    public void setMoney(int money) {
        this.credits = money;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override

    public String toString() {
        return armor;

    }

    public static class CharacterBuilder {

        private String role;
        private String species;
        private String weapon;
        private String helmet;
        private String armor;
        private String pants;
        private String boots;
        private int HP;
        private int force;
        private int physicalDmg;
        private int specialDmg;
        private int speed;
        private int exp;
        private int level;
        private int credits;
        private String status;

        public CharacterBuilder(String role) {

            this.role = role;

        }

        public CharacterBuilder species(String species) {

            this.species = species;
            return this;

        }

        public CharacterBuilder weapon(String weapon) {

            this.weapon = weapon;
            return this;

        }

        public CharacterBuilder helmet(String helmet) {

            this.helmet = helmet;
            return this;
        }

        public CharacterBuilder armor(String armor) {

            this.armor = armor;
            return this;
        }

        public CharacterBuilder pants(String pants) {

            this.pants = pants;
            return this;
        }

        public CharacterBuilder boots(String boots) {

            this.boots = boots;
            return this;
        }

        public CharacterBuilder HP(int HP) {

            this.HP = HP;
            return this;
        }

        public CharacterBuilder force(int force) {

            this.force = force;
            return this;
        }

        public CharacterBuilder physicalDmg(int physicalDmg) {

            this.physicalDmg = physicalDmg;
            return this;
        }

        public CharacterBuilder specialDmg(int specialDmg) {

            this.specialDmg = specialDmg;
            return this;
        }

        public CharacterBuilder speed(int speed) {

            this.speed = speed;
            return this;
        }

        public CharacterBuilder exp(int exp) {

            this.exp = exp;
            return this;
        }

        public CharacterBuilder level(int level) {

            this.level = level;
            return this;
        }

        public CharacterBuilder credits(int credits) {

            this.credits = credits;
            return this;
        }

        public CharacterBuilder status(String status) {

            this.status = status;
            return this;
        }

        public Character build() {

            Character character = new Character(this);
            return character;
        }

    }

}
