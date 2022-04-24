package main.java.characterbuilder;

// TODO: Auto-generated Javadoc
/**
 * The character class is the builder design pattern with a characterbuilder to
 * make character objects with optional initalization variables
 */
public class Character {

    /** The role. */
    private String role;

    /** The species. */
    private String species;

    /** The weapon. */
    private String weapon;

    /** The helmet. */
    private String helmet;

    /** The armor. */
    private String armor;

    /** The pants. */
    private String pants;

    /** The boots. */
    private String boots;

    /** The hp. */
    private int HP;

    /** The force. */
    private int force;

    /** The physical dmg. */
    private int physicalDmg;

    /** The special dmg. */
    private int specialDmg;

    /** The speed. */
    private int speed;

    /** The exp. */
    private int exp;

    /** The level. */
    private int level;

    /** The credits. */
    private int credits;

    /** The status. */
    private String status;

    /**
     * Instantiates a new character.
     *
     * @param builder the builder
     */
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

    /**
     * Gets the role.
     *
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the role.
     *
     * @param role the new role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets the species.
     *
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Sets the species.
     *
     * @param species the new species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Gets the weapon.
     *
     * @return the weapon
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * Sets the weapon.
     *
     * @param weapon the new weapon
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    /**
     * Gets the helmet.
     *
     * @return the helmet
     */
    public String getHelmet() {
        return helmet;
    }

    /**
     * Sets the helmet.
     *
     * @param helmet the new helmet
     */
    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    /**
     * Gets the armor.
     *
     * @return the armor
     */
    public String getArmor() {
        return armor;
    }

    /**
     * Sets the armor.
     *
     * @param armor the new armor
     */
    public void setArmor(String armor) {
        this.armor = armor;
    }

    /**
     * Gets the pants.
     *
     * @return the pants
     */
    public String getPants() {
        return pants;
    }

    /**
     * Sets the pants.
     *
     * @param pants the new pants
     */
    public void setPants(String pants) {
        this.pants = pants;
    }

    /**
     * Gets the boots.
     *
     * @return the boots
     */
    public String getBoots() {
        return boots;
    }

    /**
     * Sets the boots.
     *
     * @param boots the new boots
     */
    public void setBoots(String boots) {
        this.boots = boots;
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
     * Gets the level.
     *
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the level.
     *
     * @param level the new level
     */
    public void setLevel(int level) {
        this.level = level;
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
     * Gets the money.
     *
     * @return the money
     */
    public int getMoney() {
        return credits;
    }

    /**
     * Sets the money.
     *
     * @param money the new money
     */
    public void setMoney(int money) {
        this.credits = money;
    }

    /**
     * Gets the status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param status the new status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override

    public String toString() {
        return armor;

    }

    /**
     * The Class CharacterBuilder.
     */
    public static class CharacterBuilder {

        /** The role. */
        private String role;

        /** The species. */
        private String species;

        /** The weapon. */
        private String weapon;

        /** The helmet. */
        private String helmet;

        /** The armor. */
        private String armor;

        /** The pants. */
        private String pants;

        /** The boots. */
        private String boots;

        /** The hp. */
        private int HP;

        /** The force. */
        private int force;

        /** The physical dmg. */
        private int physicalDmg;

        /** The special dmg. */
        private int specialDmg;

        /** The speed. */
        private int speed;

        /** The exp. */
        private int exp;

        /** The level. */
        private int level;

        /** The credits. */
        private int credits;

        /** The status. */
        private String status;

        /**
         * Instantiates a new character builder.
         *
         * @param role the role
         */
        public CharacterBuilder(String role) {

            this.role = role;

        }

        /**
         * Species.
         *
         * @param species the species
         * @return the character builder
         */
        public CharacterBuilder species(String species) {

            this.species = species;
            return this;

        }

        /**
         * Weapon.
         *
         * @param weapon the weapon
         * @return the character builder
         */
        public CharacterBuilder weapon(String weapon) {

            this.weapon = weapon;
            return this;

        }

        /**
         * Helmet.
         *
         * @param helmet the helmet
         * @return the character builder
         */
        public CharacterBuilder helmet(String helmet) {

            this.helmet = helmet;
            return this;
        }

        /**
         * Armor.
         *
         * @param armor the armor
         * @return the character builder
         */
        public CharacterBuilder armor(String armor) {

            this.armor = armor;
            return this;
        }

        /**
         * Pants.
         *
         * @param pants the pants
         * @return the character builder
         */
        public CharacterBuilder pants(String pants) {

            this.pants = pants;
            return this;
        }

        /**
         * Boots.
         *
         * @param boots the boots
         * @return the character builder
         */
        public CharacterBuilder boots(String boots) {

            this.boots = boots;
            return this;
        }

        /**
         * Hp.
         *
         * @param HP the hp
         * @return the character builder
         */
        public CharacterBuilder HP(int HP) {

            this.HP = HP;
            return this;
        }

        /**
         * Force.
         *
         * @param force the force
         * @return the character builder
         */
        public CharacterBuilder force(int force) {

            this.force = force;
            return this;
        }

        /**
         * Physical dmg.
         *
         * @param physicalDmg the physical dmg
         * @return the character builder
         */
        public CharacterBuilder physicalDmg(int physicalDmg) {

            this.physicalDmg = physicalDmg;
            return this;
        }

        /**
         * Special dmg.
         *
         * @param specialDmg the special dmg
         * @return the character builder
         */
        public CharacterBuilder specialDmg(int specialDmg) {

            this.specialDmg = specialDmg;
            return this;
        }

        /**
         * Speed.
         *
         * @param speed the speed
         * @return the character builder
         */
        public CharacterBuilder speed(int speed) {

            this.speed = speed;
            return this;
        }

        /**
         * Exp.
         *
         * @param exp the exp
         * @return the character builder
         */
        public CharacterBuilder exp(int exp) {

            this.exp = exp;
            return this;
        }

        /**
         * Level.
         *
         * @param level the level
         * @return the character builder
         */
        public CharacterBuilder level(int level) {

            this.level = level;
            return this;
        }

        /**
         * Credits.
         *
         * @param credits the credits
         * @return the character builder
         */
        public CharacterBuilder credits(int credits) {

            this.credits = credits;
            return this;
        }

        /**
         * Status.
         *
         * @param status the status
         * @return the character builder
         */
        public CharacterBuilder status(String status) {

            this.status = status;
            return this;
        }

        /**
         * Builds the.
         *
         * @return the character
         */
        public Character build() {

            Character character = new Character(this);
            return character;
        }

    }

}
