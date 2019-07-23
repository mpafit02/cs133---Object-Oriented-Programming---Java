package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Angler Unit is a Unit and implements Convertable. It can convert only in
 * WATER tiles.
 * 
 * Constructor: AnglerUnit(Civilization owner)
 * 
 * Methods: symbol, toString, convert, canConvert
 * 
 * @author Marios
 *
 */
public class AnglerUnit extends Unit implements Convertable {

	/**
	 * @param owner;
	 */
	public AnglerUnit(Civilization owner) {
		super(owner);
	}

	@Override
	public char symbol() {
		return 'a';
	}

	@Override
	public String toString() {
		return "Anglers. " + super.toString();
	}

	
	@Override
	public Building convert() {
		return new FishingShack(this.getOwner());
	}

	@Override
	public boolean canConvert(TileType type) {
		if (type.equals(TileType.WATER))
			return true;
		return false;
	}
}
