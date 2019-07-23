package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Getters: getSymbol, getName, getCost
 * 
 * Constructors: TileType(char symbol, String name, int cost)
 * 
 * TileType is an enum contains the PLAINS, MOUNTAIN, HILLS, ICE, WATER and the FOREST
 * 
 * @author Marios
 *
 */
enum TileType {

    PLAINS('P', "Plains", 1),
    MOUNTAIN('M', "Mountain", 5),
    HILLS('H', "Hills", 3),
    ICE('I', "Ice", 3),
    WATER('W', "Water", 5),
    FOREST('F', "Forest", 2);

    private char symbol;
    private String name;
    private int cost;

    /**
     * @param symbol;
     * @param name;
     * @param cost;
     */
    private TileType(char symbol, String name, int cost) {
        this.symbol = symbol;
        this.name = name;
        this.cost = cost;
    }

    /**
     * @return this.symbol;
     */
    public char getSymbol() {
        return this.symbol;
    }

    /**
     * @return this.name;
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return this.cost;
     */
    public int getCost() {
        return this.cost;
    }
}
