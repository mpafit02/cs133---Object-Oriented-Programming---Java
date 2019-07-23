package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Farmer Unit is a Unit and implements Convertable. It can convert only in
 * PLAINS tiles.
 * 
 * Constructor: FarmerUnit(Civilization owner)
 * 
 * Methods: symbol, toString, convert, canConvert
 * 
 * @author Marios
 *
 */

public class FarmerUnit extends Unit implements Convertable {

	/**
	 * @param owner;
	 */
	public FarmerUnit(Civilization owner) {
		super(owner);
	}

	@Override
	public char symbol() {
		return 'f';
	}

	@Override
	public String toString() {
		return "Farmers. " + super.toString();
	}

	@Override
	public Building convert() {
		return new Farm(this.getOwner());
	}

	@Override
	public boolean canConvert(TileType type) {
		if (type.equals(TileType.PLAINS))
			return true;
		return false;
	}
}