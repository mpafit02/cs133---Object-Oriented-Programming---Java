package model;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Convertable is an interface with the methods convert and canConvert(TileType
 * type)
 * 
 * @author Marios
 *
 */
interface Convertable {
	/**
	 * @return Building;
	 */
	Building convert();

	/**
	 * @param type;
	 * @return boolean;
	 */
	boolean canConvert(TileType type);
}
