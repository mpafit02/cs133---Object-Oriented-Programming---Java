package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Coal Miner Unit is a Unit and implements Convertable. It can convert only in
 * HILLS tiles.
 * 
 * Constructor: CoalMinerUnit(Civilization owner)
 * 
 * Methods: symbol, toString, convert, canConvert
 * 
 * @author Marios
 *
 */
public class CoalMinerUnit extends Unit implements Convertable {

	/**
	 * @param owner;
	 */
	public CoalMinerUnit(Civilization owner) {
		super(owner);
	}

	@Override
	public char symbol() {
		return 'c';
	}

	@Override
	public String toString() {
		return "Coal Miners. " + super.toString();
	}

	@Override
	public Building convert() {
		return new CoalMine(this.getOwner());
	}

	@Override
	public boolean canConvert(TileType type) {
		if (type.equals(TileType.HILLS))
			return true;
		return false;
	}
}