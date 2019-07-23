package model;
/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Treasury is the class which controls the gold of every Civilization
 * 
 * Getters: getCoins
 * 
 * Setters: setOwner, setCanAttack, setBaseEndurance
 * 
 * Constructors: Treasury(int coins), Treasury() // coins = 500
 * 
 * Methods: spend, earn
 * 
 * @author Marios
 *
 */
class Treasury {
    private int coins;

    /**
     * @param coins;
     */
    public Treasury(int coins) {
        this.coins = coins;
    }

    public Treasury() {
        this(500);
    }

    /**
     * @return coins;
     */
    public int getCoins() {
        return coins;
    }

    /**
     * @param cost;
     * @return boolean;
     */
    public boolean spend(int cost) {
        this.coins -= cost;
        return true;
    }

    /**
     * @param pay;
     */
    public void earn(int pay) {
        this.coins += pay;
    }
}
