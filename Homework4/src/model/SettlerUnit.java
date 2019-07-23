package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Settler Unit is a Unit and implements Convertable. It can convert only in
 * PLAINS tiles.
 * 
 * Constructor: SettlerUnit(Civilization owner)
 * 
 * Methods: symbol, toString, convert, canConvert
 * 
 * @author Marios
 *
 */

public class SettlerUnit extends Unit implements Convertable {

	private String townName;

	/**
	 * @param owner;
	 * @param townName;
	 */
	public SettlerUnit(Civilization owner, String townName) {
		super(owner);
		this.townName = townName;
	}

	@Override
	public char symbol() {
		return 's';
	}

	@Override
	public String toString() {
		return "Settlers of " + townName + " " + super.toString();
	}

	@Override
	public Building convert() {
		this.getOwner().incrementNumSettlements();
		return new Settlement(this.getOwner(), townName);
	}

	@Override
	public boolean canConvert(TileType type) {
		if (type.equals(TileType.PLAINS))
			return true;
		return false;
	}
}