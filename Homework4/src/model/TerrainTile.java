package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * TerrainTile implements Symbolizable. It is responsible for all the tiles in
 * the map.
 * 
 * Getters: getType, getOccupant
 * 
 * Setters: setOccupant
 * 
 * Constructors: TerrainTile(TileType type, MapObject occupant), TerrainTile(TileType type) 
 * 
 * Methods: isEmpty, toString, symbol
 * 
 * @author Marios
 *
 */

class TerrainTile implements Symbolizable {
	private MapObject occupant;
	private TileType type;

	/**
	 * @param type;
	 * @param occupant;
	 */
	public TerrainTile(TileType type, MapObject occupant) {
		this.type = type;
		this.occupant = occupant;
	}

	/**
	 * @param type;
	 */
	public TerrainTile(TileType type) {
		this(type, null);
	}

	/**
	 * @return type;
	 */
	public TileType getType() {
		return type;
	}

	/**
	 * @param occupant;
	 */
	public void setOccupant(MapObject occupant) {
		this.occupant = occupant;
	}

	/**
	 * @return occupant;
	 */
	public MapObject getOccupant() {
		return occupant;
	}

	/**
	 * @return boolean;
	 */
	public boolean isEmpty() {
		return occupant == null;
	}

	@Override
	public char symbol() {
		return type.getSymbol();
	}

	@Override
	public String toString() {
		return type.getName() + " tile that has an endurance cost of " + type.getCost();
	}
}
