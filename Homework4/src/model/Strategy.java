package model;
/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Strategy is the class which controls the strategy level of a Civilization
 * 
 * Getters: getStrategyLevel
 * 
 * Setters: setConqueredTheWorld
 *  
 * Methods: battle, siege, conqueredTheWorld
 * 
 * @author Marios
 *
 */
class Strategy {
    private int strategyLevel;
    private boolean conqueredTheWorld;
    private static final int BATTLE_INCREASE = 10;
    private static final int SIEGE_INCREASE = 40;

    public void battle() {
        strategyLevel += BATTLE_INCREASE;
        setConqueredTheWorld();
    }

    public void siege() {
        strategyLevel += SIEGE_INCREASE;
        setConqueredTheWorld();
    }

    /**
     * @return boolean;
     */
    public boolean conqueredTheWorld() {
        return conqueredTheWorld;
    }

    /**
     * @return strategyLevel;
     */
    public int getStrategyLevel() {
        return strategyLevel;
    }

    private void setConqueredTheWorld() {
        conqueredTheWorld = (strategyLevel >= 150);
    }
}
