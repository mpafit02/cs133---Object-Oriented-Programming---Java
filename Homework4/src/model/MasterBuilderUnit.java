package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Master Builder Unit is a Unit and implements Convertable. It can convert only
 * in PLAINS tiles.
 * 
 * Constructor: MasterBuilderUnit(Civilization owner)
 * 
 * Methods: symbol, toString, convert, canConvert
 * 
 * @author Marios
 *
 */

public class MasterBuilderUnit extends Unit implements Convertable {

	/**
	 * @param owner;
	 */
	public MasterBuilderUnit(Civilization owner) {
		super(owner);
	}

	@Override
	public char symbol() {
		return 'm';
	}

	@Override
	public String toString() {
		return "Master Builders. " + super.toString();
	}

	@Override
	public Building convert() {
		return new Landmark(this.getOwner());
	}

	@Override
	public boolean canConvert(TileType type) {
		if (type.equals(TileType.PLAINS))
			return true;
		return false;
	}
}