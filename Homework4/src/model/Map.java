package model;

import java.util.Random;

/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Map class is responsible to draw the terrain tiles.
 * 
 * Getters: getRows, getColumns, getTile
 * 
 * Constructors: Map(int rows, int columns)
 * 
 * Methods: isEmpty, toString
 * 
 * @author Marios
 *
 */

class Map {

	private TerrainTile[][] map;

	/**
	 * @param rows;
	 * @param columns;
	 */
	public Map(int rows, int columns) {
		TileType[] types = TileType.values();
		map = new TerrainTile[rows][columns];
		Random rand = new Random();
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				map[r][c] = new TerrainTile(types[rand.nextInt(types.length)]);
			}
		}
	}

	/**
	 * @param r;
	 * @param c;
	 * @return map[r][c];
	 */
	public TerrainTile getTile(int r, int c) {
		return map[r][c];
	}

	/**
	 * @param r;
	 * @param c;
	 * @return boolean;
	 */
	public boolean isEmpty(int r, int c) {
		return map[r][c].getOccupant() == null;
	}

	/**
	 * @return map.length;
	 */
	public int getRows() {
		return map.length;
	}

	/**
	 * @return map[0].length;
	 */
	public int getColumns() {
		return map[0].length;
	}

	public String toString() {
		String ret = "";

		for (int i = 0; i < map[0].length / 2; i++) {
			ret += "      ____";
		}

		if (map[0].length % 2 == 1) {
			ret += "      ____";
		}
		ret += "\n";

		for (int r = 0; r < map.length; r++) {
			String rowString = "";
			for (int c = 0; c < map[r].length; c += 2) {
				TerrainTile tile = map[r][c];
				String tileString = tile.symbol() + ""
						+ (tile.getOccupant() != null ? tile.getOccupant().symbol() : ' ') + "" + r + "" + c;
				rowString += "____/" + tileString + "\\";
			}
			if (map[r].length % 2 == 0) {
				rowString += "____";
			}
			rowString = "     " + rowString.substring(4);
			if (r != 0 && map[r].length % 2 == 0) {
				rowString += "/";
			}
			rowString += "\n     ";
			for (int c = 1; c < map[r].length; c += 2) {
				TerrainTile tile = map[r][c];
				String tileString = tile.symbol() + ""
						+ (tile.getOccupant() != null ? tile.getOccupant().symbol() : ' ') + "" + r + "" + c;
				rowString += "\\____/" + tileString;
			}
			if (map[r].length % 2 == 0) {
				rowString += "\\";
			} else {
				rowString += "\\____/";
			}
			rowString += "\n";
			ret += rowString;
		}

		ret += "      ";

		for (int i = 1; i < map[0].length; i += 2) {
			ret += "    \\____/";
		}

		return ret + "\n";
	}
}
